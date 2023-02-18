public class Planet {
    
int sunDistance;
int planetRadius;
double currentAngle;
int velocity;



    public Planet(int sunDistance, int planetRadius, double currentAngle, int velocity){
        this.sunDistance = sunDistance;
        this.planetRadius = planetRadius;
        this.currentAngle = currentAngle;
        this.velocity = velocity;
        
        
    }

    public int getSunDistance(){
        return this.sunDistance;
    }

    public int getPlanetRadius(){
        return this.planetRadius;
    }

    public int getPlanetx(){
        return (int) (sunDistance * Math.cos(currentAngle * Math.PI/180));
    }

    public int getPlanety(){
        return (int) (sunDistance * Math.sin(currentAngle * Math.PI/180));
    }

    public void setCurrentAngle(){
        this.currentAngle += this.velocity;
    }


    


}
