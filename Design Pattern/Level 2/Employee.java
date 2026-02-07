import java.util.Scanner;
import java.lang.*;

public class Employee {
     String name;
     int id;
     double salary;


     //default constructor
     Employee(){
        name= "Not Assigned";
        id= 0;
        salary = 150000;
     }

     Employee(String name, int id, double salary){
        this.name =name;
        this.id =id;
        this.salary=salary;
     }

     public void display(){
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("Salary: " + salary);
     }

     public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
        System.out.println();
        Employee e2 = new Employee("Binte", 007, 2000000);
        e2.display();
     }
}
