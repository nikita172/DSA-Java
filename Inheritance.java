package oopsConcept;


class Shape{
	String color;
	float area;
	float perimeter;
}
class Triangle extends Shape{
	public void printarea() {
		System.out.println(area);
	}
}
class EquilateralTriangle extends Triangle{
	public void printperi() {
		System.out.println(perimeter);
	}
}

class Square extends Shape{
	public void print() {
		System.out.println(color);
	}
	
}
public class Inheritance {		
	public static void main(String args[]) {
		Square t= new Square();
		t.color="red";
		t.print();
	}

}
