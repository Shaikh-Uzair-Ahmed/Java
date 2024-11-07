package Experiment_4;
import java.util.Scanner;


abstract class Shape{
    int dim1;
    int dim2;
    abstract void printArea();
}

class Rectangle extends Shape{
    Rectangle(int b,int h){dim1=b;dim2=h;}
    void printArea(){System.out.println("Area of rectangle is "+dim1*dim2);}
}
class Triangle extends Shape{
    Triangle(int b,int h){dim1=b;dim2=h;}
    void printArea(){System.out.println("Area of triangle is "+0.5*dim1*dim2);}
}

class Circle extends Shape{
    Circle(int r){dim1=r;dim2=r;}
    void printArea(){System.out.println("Area of circle is "+3.14*dim1*dim2);}
}

class Area {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b1,b2,h1,h2,r;
        System.out.println("Enter base and height of Rectangle ");
        b1 = s.nextInt();
        h1 = s.nextInt();
        s.nextLine();
        System.out.println("Enter base and height of Triangle ");
        b2 = s.nextInt();
        h2 = s.nextInt();
        s.nextLine();
        System.out.println("Enter Radius of Circle ");
        r = s.nextInt();
        s.nextLine();
        Rectangle R = new Rectangle(b1, h1);
        Triangle T = new Triangle(b2,h2);
        Circle C = new Circle(r);
        R.printArea();
        T.printArea();
        C.printArea();
        s.close();
    }
    
}
