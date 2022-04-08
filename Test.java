abstract class Shape{
	public abstract void draw(); 
}

abstract class Rectangle extends Shape{
}

class Square extends Rectangle{
	public void draw(){
	System.out.println("Drawing Square....!");
}
}

class Circle extends Shape{
	public void draw(){
		System.out.println("Drawing Circle");
	}
}

class Triangle extends Shape{
	public void draw(){
		System.out.println("Drawing Traingle!!");
	}
}

public class Test{
	public static void main(String[] args) {
		Shape s1=new Square();
		s1.draw();
		Shape s2=new Circle();
		s2.draw();
		Shape s3=new Triangle();
		s3.draw();
	}
}

