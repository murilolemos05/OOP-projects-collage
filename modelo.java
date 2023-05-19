import java.lang.Math;
import java.util.Scanner;
public class modelo{

public  double getBase(){
    Scanner in = new Scanner(System.in);
    double doubleValue = 0;
    System.out.println("Enter a value for the rectangle base:");
    doubleValue = in.nextDouble();
    return doubleValue;
}


public  double getHeight(){
    Scanner in = new Scanner(System.in);
    double doubleValue = 0;
    System.out.println("Enter a value for the rectangle height:");
    doubleValue = in.nextDouble();
    return doubleValue;
 }

public  double calcArea(double base , double height){

    double rectangleArea = 0;
    rectangleArea = (base * height);
    return rectangleArea;
}

public  double calcDiagonal(double base , double height){

    double diagonal = 0;
    diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    return diagonal;
}

public  double calcPerimeter(double base , double height){
    double rectanglePerimeter = 0;
    rectanglePerimeter = (2*base + 2*height);
    return rectanglePerimeter;
}

public  String toString(double rectanglePerimeter , double calcDiagonal , double calcArea){

return ("Perimeter: "+ rectanglePerimeter + " Diagonal: " + calcDiagonal + " Area: " + calcArea);

}


}

