

package basicshape;

public class Circle extends BasicShape {
    
    long centerX,centerY;   
    double radius,areaCircle;

    Circle(){}
    
    public Circle(long centerX, long centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    
    void setCenterX(long centerX){
        this.centerX=centerX;
    }
    
    long getCenterX(){
        
        return centerX;
        
    }
    
    void setCenterY(long centerY){
        this.centerY=centerY;
    }
    
    long getCenterY(){
        
        return centerY;
        
    }
    
    
    @Override
   public double calcArea(){
    
       radius=Math.sqrt((centerX*centerX)+(centerY*centerY));
       areaCircle=3.14*radius*radius;
         return areaCircle;
         
    }
}