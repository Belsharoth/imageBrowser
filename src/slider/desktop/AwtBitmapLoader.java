package slider.desktop;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import slider.model.Bitmap;
import slider.model.BitmapLoader;

public class AwtBitmapLoader extends BitmapLoader {

    @Override
    public Bitmap load(String uri) {
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(uri));
            return new AwtBitmap(bufferedImage);
        } catch (IOException ex) {
            Logger.getLogger(SliderFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
