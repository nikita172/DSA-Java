package oopsConcept;

public class DefaultConstrutor {
	int a=10;
	int b=20;
	
	DefaultConstrutor(){
		System.out.println("constructor created");
	}
	public void sum() {
		System.out.println(a+b);
	}
	
	public static void main(String args[]) {
		DefaultConstrutor dc= new DefaultConstrutor();
		dc.sum();
	}

}
