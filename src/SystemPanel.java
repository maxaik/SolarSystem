import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;

public class SystemPanel extends JPanel implements Runnable {
    
    static int panelHeight = 600;
    static int panelWidth = 900;
    int xOrigo = panelWidth / 2;
    int yOrigo = panelHeight / 2;
    Planet earth = new Planet(100, 20, 0, 1);
    Thread thread;

    SystemPanel(){

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.BLACK);

        thread = new Thread(this, "Solar system");
        thread.start();

        
    }

    public void paint(Graphics g){
        super.paint(g);
        //Draw earth path
        g.setColor(Color.WHITE);
        g.drawOval(xOrigo-earth.getSunDistance(), yOrigo-earth.getSunDistance(), earth.getSunDistance()*2, earth.getSunDistance()*2);

        //Draw earth
        g.setColor(Color.GREEN);
        g.fillOval(xOrigo + earth.getPlanetx() - earth.getPlanetRadius(), yOrigo + earth.getPlanety() - earth.getPlanetRadius(), earth.getPlanetRadius()*2, earth.getPlanetRadius()*2);
        
    }

    @Override
    public void run() {


        while (true){
            this.repaint();
            earth.setCurrentAngle();
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
        
        
        
    }


}
