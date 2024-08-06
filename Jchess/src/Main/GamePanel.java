package main;
import java.awt.*;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable
{
    public static final int width = 1100;
    public static final int height = 800;
    final int FPS = 60;
    Thread gameThread;

    public GamePanel()
    {
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.BLACK);
    }
    public void launchGame(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    public void run(){

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
