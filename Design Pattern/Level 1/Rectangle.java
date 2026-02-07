
import java.lang.*;


public class Rectangle {
    float length, width;

    Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }

    public float area(){
        return length*width;
    }

    public static void main(String[] args){
    Rectangle r= new Rectangle(04, 05);
    System.out.println("the area of Rectangle: "+r.area());
}

}


