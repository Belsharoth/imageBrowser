package slider.desktop;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SliderFrame extends JFrame {
    
    private ImagePanel panel;

    public SliderFrame()  {
        super();
        setTitle("Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024,768);
        setVisible(true);
    }

    public void addPanel(JPanel panel) {
        getContentPane().add(panel);
    }
    

}
