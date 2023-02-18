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

        planetList[0] = new Planet("Mercury", 150, earthRadius*0.382, 88, earthVel/(0.241), new Color(26,26,26));
        planetList[1] = new Planet("Venus",180, earthRadius*0.949, 320, -earthVel/(0.615), new Color(230,230,230));
        planetList[2] = new Planet("Earth",210, earthRadius, 215, earthVel, new Color(47,106,105));
        planetList[3] = new Planet("Mars",240, earthRadius*0.53, 250, earthVel/(1.88), new Color(153,61,0));
        planetList[4] = new Planet("Jupiter",270, earthRadius*11.2/4, 340, earthVel/(11.86), new Color(176,127,53));
        planetList[5] = new Planet("Saturn",300, earthRadius*9.41/4, 40, earthVel/(29.46), new Color(176, 143, 54));
        planetList[6] = new Planet("Uranus",330, earthRadius*3.98/4, 315, -earthVel/(84.01), new Color(85, 128, 170));
        planetList[7] = new Planet("Neptune",360, earthRadius*3.81/4, 10, earthVel/(164.8), new Color(54, 104, 150));



 
        SystemFrame frame = new SystemFrame();
    }
}
