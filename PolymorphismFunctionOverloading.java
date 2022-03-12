package oopsConcept;

public class PolymorphismFunctionOverloading {
	//polymorphism means many forms.it is a concept in which we can perform 
	//a single action in many different ways.
	//function overloading is compile-time polymorphism
	
	public int Overloading(int a, int b) {
		return a+b;
	}
	public int Overloading(int a, int b,int c) {
		return a+b+c;
	}
	public float Overloading(float a, float b) {
		return a+b;
	}
	public int Overloading(int a) {
		return a;
	}
	public void Overloading() {
		System.out.println("nothing to show");
	}
	public void Overloading(String a) {
		System.out.println(a);
	}
	public static void main(String args[]) {
		PolymorphismFunctionOverloading fo = new PolymorphismFunctionOverloading();
		System.out.println(fo.Overloading(10,20));
		System.out.println(fo.Overloading(10,20,30));
		System.out.println(fo.Overloading(10.60f,20.4f));
		System.out.println(fo.Overloading(10));
		fo.Overloading();
		fo.Overloading("nikita");
	}

}
