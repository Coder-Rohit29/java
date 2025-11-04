import java.util.Scanner;
abstract class Shape{
    int a,b;
    Shape(int a,int b){
        this.a = a;
        this.b =b;
    }
    abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(int a,int b){
            super(a,b);
    }

    void printArea(){
       System.out.println("Area of Rectangle =" + a*b  );
    }
}

class Triangle extends Shape{
    Triangle(int a,int b){
            super(a,b);
    }

    void printArea(){
        double area = (0.5)*a*b;
       System.out.println("Area of Triangle =" +  area );
    }
}

class Circle extends Shape{
    Circle(int a){
            super(a,0);
    }

    void printArea(){
        double area = (3.14*a*a);
       System.out.println("Area of Circle =" + area );
    }
}

public class labprogramn4{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Dimension of the rectangle(length and breath)");
        int len = s.nextInt();
        int bre = s.nextInt();
        Rectangle ob = new Rectangle(len,bre);

        System.out.println("Enter the Dimension of the triangle(base and height)");
        int base = s.nextInt();
        int height = s.nextInt();
        Triangle ob1 = new Triangle(base,height);

        System.out.println("Enter the Dimension of the Circle(radius)");
        int radius = s.nextInt();
        Circle ob2 = new Circle(radius);

        ob.printArea();
        ob1.printArea();
        ob2.printArea();
    }
} 