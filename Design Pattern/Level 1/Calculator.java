import java.util.Scanner;

public class Calculator {
    double a, b;

    Calculator(double a, double b){
        this.a=a;
        this.b=b;
    } 

    public double addition(){
        return a+b;
    }

    public double subtraction(){
        return a-b;
    }

    public double multiplication(){
        return a*b;
    }

    public double division(double m, double n){
        return m/n;
    }

    public static void main(String[] args){
         Calculator c = new Calculator(20, 30);
         System.out.println(c.addition());
         System.out.println(c.subtraction());
         System.out.println(c.multiplication());
         System.out.println(c.division(4, 2));
    }
    }
    

