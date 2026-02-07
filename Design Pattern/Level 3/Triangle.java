class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing triangle");
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Triangle();

        s1.draw();
        s2.draw();
    }
}



