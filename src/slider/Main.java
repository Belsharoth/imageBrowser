package slider;

import slider.desktop.FileImageListLoader;
import slider.desktop.SliderFrame;
import slider.desktop.SwingImageViewer;
import slider.model.ImageList;
import slider.model.Slider;
import slider.model.SliderObserver;

public class Main {

    public static void main(String[] args) {
        ImageList imageList = FileImageListLoader.getInstance().load("images");
        Slider slider = new Slider(imageList.get(0));
        
        SwingImageViewer imageViewer = new SwingImageViewer();
        
        SliderObserver sliderObserver = new SliderObserver(slider);
        sliderObserver.setImageViewer(imageViewer);
        
        SliderFrame frame = new SliderFrame();
        frame.addPanel(imageViewer.getPanel());
        
        slider.play(2000);
        
    }
}
