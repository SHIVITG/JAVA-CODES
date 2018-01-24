

package basicshape;

    abstract public class BasicShape {

  private double area;
  
  BasicShape(){}
  
  public double getArea(){
     
      area=calcArea();
      return area;
  }
  
  abstract public double calcArea();
  
}