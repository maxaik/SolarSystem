import java.awt.Color;
public class Main {
    /**
     * @author Max Linghag Ahlgren
     * @version 2023-02-18
     * 
     * An animation of the solar system
     * 
     */

    static double earthVel = 0.5;
    static int earthRadius = 20;
    static Planet[] planetList = new Planet[8];

    public static void main(String[] args) {

        // Creating all the planets and their size and velocity relative to the earth. 
        // the bigger planets have been reduced by 4 in size

        Planet mercury = new Planet(150, earthRadius*0.382, 88, earthVel/(0.241), new Color(26,26,26));
        Planet venus = new Planet(180, earthRadius*0.949, 320, -earthVel/(0.615), new Color(230,230,230));
        Planet earth = new Planet(210, earthRadius, 215, earthVel, new Color(47,106,105));
        Planet mars = new Planet(240, earthRadius*0.53, 250, earthVel/(1.88), new Color(153,61,0));
        Planet jupiter = new Planet(270, earthRadius*11.2/4, 340, earthVel/(11.86), new Color(176,127,53));
        Planet saturn = new Planet(300, earthRadius*9.41/4, 40, earthVel/(29.46), new Color(176, 143, 54));
        Planet uranus = new Planet(330, earthRadius*3.98/4, 315, -earthVel/(84.01), new Color(85, 128, 170));
        Planet neptune = new Planet(360, earthRadius*3.81/4, 10, earthVel/(164.8), new Color(54, 104, 150));

        planetList[0] = mercury;
        planetList[1]=venus;
        planetList[2]=earth;
        planetList[3]=mars;
        planetList[4]=jupiter;
        planetList[5]=saturn;
        planetList[6]=uranus;
        planetList[7]=neptune;

 
        SystemFrame frame = new SystemFrame();
    }
}
