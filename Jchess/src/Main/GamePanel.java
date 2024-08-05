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
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("This is my custom pamnel!!", 10, 20);
<<<<<<< HEAD
//        redSquare.paintSquare(g);
=======
        
>>>>>>> 70b88aa0b96649496b44e012ebd739f946d890c9
    }
}
