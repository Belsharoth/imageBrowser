package slider.model;

public class Image {
    private String uri;
    private BitmapLoader loader;
    private Bitmap bitmap;
    public Image next;
    public Image prev;

    public Image(String uri, BitmapLoader loader) {
        this.uri = uri;
        this.loader = loader;
        this.bitmap = null;
    }

    public Bitmap getBitmap() {
        if (bitmap == null) {
            bitmap = loader.load(uri);
        }
        return bitmap;
    }

    public Image getNext() {
        return next;
    }

    public Image getPrev() {
        return prev;
    }

    public void setNext(Image next) {
        this.next = next;
    }

    public void setPrev(Image prev) {
        this.prev = prev;
    }
    

}
