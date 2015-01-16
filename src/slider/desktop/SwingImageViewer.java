package slider.desktop;

import slider.model.Bitmap;
import slider.view.ImageViewer;

public class SwingImageViewer extends ImageViewer {
    
    private ImagePanel panel;

    public SwingImageViewer() {
        this.panel = new ImagePanel();
    }

    public ImagePanel getPanel() {
        return panel;
    }

    @Override
    public void refresh() {
        Bitmap bitmap = getImage().getBitmap();
        if (bitmap instanceof AwtBitmap) {
            AwtBitmap awtBitmap = (AwtBitmap) bitmap;
            panel.setImage(awtBitmap.getData());
        }
    }
    

}
