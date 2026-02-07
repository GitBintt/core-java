import java.lang.*;
import java.util.Scanner;

public class AreaCalculator {
    
    double area(double radius){                 //method overloading 
        return 3.14 * radius * radius ;        //circle
    }

    double area(double length, double width){          //method overloading 
        return length * width ;                       //rectangle 
    } 

    double area(double base, double height, boolean triangle){          //method overloading 
        return 0.5 * base * height ;                  //triangle
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        System.out.println("Area of circle : "+ ac.area(5));
        System.out.println("Area of Rectangle : "+ ac.area(5, 6));
        System.out.println("Area of Triangle : "+ ac.area(5, 06, true));
    }
}

