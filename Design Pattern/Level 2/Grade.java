import java.util.Scanner;
import java.lang.*;


public class Grade {
    private double oop;
    private double dp;
    private double toc;


    public void inputMarks(double s1, double s2, double s3){
        oop = s1;
        dp = s2;
        toc =s3;
    }

    public double CalculateAverage(){
        return (oop + dp + toc) / 3;
    }

    public char determineGrade(){
        double avg = CalculateAverage();
        if(avg >= 80){
            return 'A';
        }
        else if(avg >= 60){
            return 'B';
        }
        else if(avg >= 40){
            return 'C';
        }
        else{
            return 'F';
        }
    }

    public static void main(String[] args) {
        Grade g = new Grade();
        g.inputMarks(87,77, 65);

        System.out.println("Average Marks: " + g.CalculateAverage());
        System.out.println("Grade: " + g.determineGrade());
    }
}
