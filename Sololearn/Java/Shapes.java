import java.util.*;
abstract class Shape{
	int width;
	abstract void area();
}
class Square extends Shape{
	Square(int width){
		this.width = width;
	}
	void area(){
		System.out.println(width*width);
	}
}
class Circle extends Shape{
	Circle(int width){
		this.width = width;
	}
	void area(){
		System.out.println(Math.PI*width*width);
	}
}
public class Shapes{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Square a = new Square(in.nextInt());
		Circle b = new Circle(in.nextInt());
		a.area();
		b.area();
	}
}