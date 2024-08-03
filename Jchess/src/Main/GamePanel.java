package main;
import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel
{
    public static final int width = 1100;
    public static final int height = 800;

    public GamePanel()
    {
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.BLACK);
    }
}
