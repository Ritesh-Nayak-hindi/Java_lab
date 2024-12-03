import java.util.*;
import java.util.Scanner;
abstract class Shape{
    int a,b;
    Shape(){
        this.a=90;
        this.b=99;
    }
    abstract void printArea();//ABSTRACT METHODS SHOULD NEVER HAVE A BODY OF ITS OWN;
}
class Rectangle extends Shape{
    int l,b;
    Rectangle(int l,int b){
        System.out.println("INSIDE RECTANGLE CLASS");
        this.l=l;
        this.b=b;
    }
    void printArea(){
        System.out.println("AREA OF THE RECTANGLE IS: "+(l*b));
    }
}
class Triangle extends Shape{
    float h,b;
    Triangle(float h,float b){
        System.out.println("INSIDE Triangle CLASS");
        this.h=h;
        this.b=b;
    }
    void printArea(){
        System.out.println("AREA OF THE Triangle IS: "+(float)(h*b*0.5));
    }
}
class Circle extends Shape{
    float r;
    float pi=3.14f;
    Circle(float r){
        System.out.println("INSIDE Circle CLASS");
        this.r=r;
    }
    void printArea(){
        System.out.println("AREA OF THE Circle IS: "+(float)(pi*r*r));
    }
}
public class labpro{
    public static void main(String args[]){
        Rectangle R1=new Rectangle(10,10);
        Triangle T1= new Triangle(10,1);
        Circle C1=new Circle(10);
        R1.printArea();
        T1.printArea();
        C1.printArea();
    }
}
