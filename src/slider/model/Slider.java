package slider.model;

import java.util.Timer;
import java.util.TimerTask;

public class Slider extends Observable {
    
    private Image currentImage;
    private Timer timer;

    public Slider(Image currentImage) {
        this.currentImage = currentImage;
    }

    public Image getCurrentImage() {
        return currentImage;
    }

    public void setCurrentImage(Image currentImage) {
        this.currentImage = currentImage;
    }
    
    public void next() {
        currentImage = currentImage.next;
        notifyChanges();
    }

    public void prev() {
        currentImage = currentImage.prev;
        notifyChanges();
    }
    
    public void play(int period) {
        if (timer != null) return;
        timer = new Timer();
        timer.scheduleAtFixedRate(getTimerTask(), period, period);
    }
    
    public void pause() {
        if (timer == null) return;
        timer.cancel();
        timer = null;
    }

    private TimerTask getTimerTask() {
        return new TimerTask() {

            @Override
            public void run() {
                next();
            }
        };
    }
    

}
