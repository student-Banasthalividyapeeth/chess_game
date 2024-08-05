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
<<<<<<< HEAD

=======
    private void Update()
    {

    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("This is my custom pamnel!!", 10, 20);
        redSquare
    }
>>>>>>> b6347584650bf8095fa1ff6e868299ea38e242cb
}
