import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;

public class SystemPanel extends JPanel implements Runnable {
    
    static int panelHeight = 800;
    static int panelWidth = 1200;
    int xOrigo = panelWidth / 2;
    int yOrigo = panelHeight / 2;

    Thread thread;

    SystemPanel(){

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.BLACK);

        thread = new Thread(this, "Solar system");
        thread.start();

        
    }

    public void paint(Graphics g){
        super.paint(g);

        //Draw sun
        g.setColor(Color.YELLOW);
        g.fillOval(xOrigo-80, yOrigo-80, 160, 160);


        //Draw planets and their paths

        for(int i= 0; i < Main.planetList.length; i++){
            //Draw path
            g.setColor(Color.WHITE);
            g.drawOval(xOrigo-Main.planetList[i].getSunDistance(), yOrigo-Main.planetList[i].getSunDistance(), Main.planetList[i].getSunDistance()*2, Main.planetList[i].getSunDistance()*2);
        }

        for(int i= 0; i < Main.planetList.length; i++){

            //Draw planets
            g.setColor(Main.planetList[i].getPlanetColor());
            g.fillOval(xOrigo + Main.planetList[i].getPlanetx() - Main.planetList[i].getPlanetRadius(), yOrigo + Main.planetList[i].getPlanety() - Main.planetList[i].getPlanetRadius(), Main.planetList[i].getPlanetRadius()*2, Main.planetList[i].getPlanetRadius()*2);
        }
        
    }

    @Override
    public void run() {

        while (true){
            this.repaint();
            for(int i= 0; i < Main.planetList.length; i++){
                Main.planetList[i].setCurrentAngle();
            }
            
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
        
        
        
    }


}
