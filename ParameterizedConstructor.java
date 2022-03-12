package oopsConcept;

public class ParameterizedConstructor {
	int a,b;
	
	ParameterizedConstructor(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("constructor created");
	}
	public void sum() {
		System.out.println(a+b);
	}
	
	public static void main(String args[]) {
		ParameterizedConstructor dc= new ParameterizedConstructor(10,20);
		dc.sum();
	}
}
