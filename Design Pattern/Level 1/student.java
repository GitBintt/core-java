import java.util.Scanner;
import java.lang.*;

public class student {

      String name;
      int id;
      double cgpa;   
      student(String name, int id, double cgpa){
        this.name= name;
        this.id= id;
        this.cgpa= cgpa;
      }
      
      public void display(){
        System.out.println("Student name: "+name);
        System.out.println("Student id: "+id);
        System.out.println("Student CGPA: "+cgpa);
      }

      public static void main(String[] args) {
        student s = new student("Sumaiyea", 007, 3.77);
        s.display();
      }
}
