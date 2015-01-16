package slider.model;

import slider.view.ImageViewer;

public class SliderObserver extends Observer {
    
    private Slider slider;
    private ImageViewer imageViewer;

    public SliderObserver(Slider slider) {
        this.slider = slider;
        this.slider.addObserver(this);
    }

    public ImageViewer getImageViewer() {
        return imageViewer;
    }

    public void setImageViewer(ImageViewer imageViewer) {
        this.imageViewer = imageViewer;
        this.imageViewer.setImage(slider.getCurrentImage());
    }


    @Override
    public void notifyChanges() {
        if (imageViewer == null) return;
        this.imageViewer.setImage(slider.getCurrentImage());
    }

}
