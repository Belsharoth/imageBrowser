package slider.model;

public abstract class ImageListLoader {
    
    public abstract ImageList load(String uri);
    
    protected ImageList link(ImageList imageList) {
        Image lastImage = imageList.get(imageList.size()-1);
        for (Image image : imageList) {
            lastImage.setNext(image);
            image.setPrev(lastImage);
            lastImage = image;
        }
        return imageList;
    }

}
