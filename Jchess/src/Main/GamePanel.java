package main;
import java.awt.*;
import javax.swing.JPanel;

public class GamePanel extends JPanel
{
    public static final int width = 1100;
    public static final int height = 800;

    public GamePanel()
    {
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.BLACK);
    }
    private void update(){
        
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("This is my custom pamnel!!", 10, 20);

    }
}
