
package basicshape;

import java.util.Scanner;

public class DriverClass {
    
  public static void main(String[] args){

      Scanner scannerObj=new Scanner(System.in);
    
      long circleX,circleY;
      long length,breadth;
      
      Circle obj1=new Circle();
      Rectangle obj2=new Rectangle();
         
      System.out.println("Enter the coordinates for the circle: ");
      circleX=scannerObj.nextLong();
      circleY=scannerObj.nextLong();
      obj1.setCenterX(circleX);
      obj1.setCenterY(circleY);
      System.out.println("Area of circle: "+obj1.calcArea());
      
      System.out.println("Enter the length and breadth of rectangle: ");
      length=scannerObj.nextLong();
      breadth=scannerObj.nextLong();
      obj2.setLengthRect(length);
      obj2.setWidthRect(breadth);
      System.out.println("Area of Rectangle: "+obj2.calcArea());
      
  }    
}
