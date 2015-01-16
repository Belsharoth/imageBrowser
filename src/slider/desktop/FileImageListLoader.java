package slider.desktop;

import java.io.File;
import java.io.FilenameFilter;
import slider.model.Image;
import slider.model.ImageList;
import slider.model.ImageListLoader;

public class FileImageListLoader extends ImageListLoader {
    
    private static FileImageListLoader instance = null;

    private FileImageListLoader() {
    }

    public static FileImageListLoader getInstance() {
        if (instance == null)
            instance = new FileImageListLoader();
        return instance;
    }
    
    @Override
    public ImageList load(String uri) {
        String[] filenames = readDirectory(uri);
        ImageList imageList = createImageList(uri, filenames);
        link(imageList);
        return imageList;
    }

    private String[] readDirectory(String uri) {
        File file = new File(uri);
        return file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });
    }

    private ImageList createImageList(String uri, String[] files) {
        ImageList imageList = new ImageList();
        AwtBitmapLoader loader = new AwtBitmapLoader();
        for (String file : files) {
            imageList.add(new Image(uri + "/" + file, loader));
        }
        return imageList;
    }

}
