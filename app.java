public class app {

public static void main(String[] args) {
  
    System.out.println("Rectangle calculation: ");
     modelo rectangle = new modelo();
     double x= rectangle.getBase();
     double y= rectangle.getHeight();
    
    double perimeter = rectangle.calcPerimeter(x, y);
    double area = rectangle.calcArea(x, y);
    double diagonal = rectangle.calcDiagonal(x, y);
     rectangle.toString(perimeter , area , diagonal);

System.out.println( rectangle.toString(perimeter , diagonal , area)); 

 } 
}