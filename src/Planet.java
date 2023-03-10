import java.awt.Color;
public class Planet {
    
String planetName;
int sunDistance;
double planetRadius;
double currentAngle;
double velocity;
Color color;



    public Planet(String planetName, int sunDistance, double planetRadius, double currentAngle, double velocity, Color color){
        this.planetName = planetName;
        this.sunDistance = sunDistance;
        this.planetRadius = planetRadius;
        this.currentAngle = currentAngle;
        this.velocity = velocity;
        this.color = color;
    }

    public String getPlanetName(){
        return this.planetName;
    }

    public int getSunDistance(){
        return this.sunDistance;
    }

    public int getPlanetRadius(){
        return (int)this.planetRadius;
    }

    public int getPlanetx(){
        return (int) (sunDistance * Math.cos(currentAngle * Math.PI/180));
    }

    public int getPlanety(){
        return (int) (sunDistance * Math.sin(currentAngle * Math.PI/180));
    }

    public Color getPlanetColor(){
        return this.color;
    }

    public void setCurrentAngle(){
        this.currentAngle += this.velocity;
    }


    


}
