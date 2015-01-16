package slider.desktop;

import java.awt.image.BufferedImage;
import slider.model.Bitmap;

public class AwtBitmap extends Bitmap {
    private BufferedImage data;

    public AwtBitmap() {
        this.data = null;
    }
    
    public AwtBitmap(BufferedImage data) {
        this.data = data;
    }
    
    public BufferedImage getData() {
        return data;
    }

    public void setData(BufferedImage data) {
        this.data = data;
    }
    

}
