package oopsConcept;

class Animal {
	String color;
	int legs;
	String type;	
	public void details() {
		System.out.println("Animal is "+ this.type);
		System.out.println("color is "+ this.color);
		System.out.println("no.of legs "+ this.legs);
	}
	public void dogVoice() {
		System.out.println("dog barks");
	}
	public void catVoice() {
		System.out.println("cat says meow");
	}
	public int sum(int a,int b) {
		return a+b;		
	}	
}
public class ClassesObject {
	public static void main(String args[]) {
		Animal a1= new Animal();
		Animal a2= new Animal();
		a1.color="red";
		a1.legs=4;
		a1.type="dog";
		a1.details();
		a1.catVoice();
		a1.dogVoice();
		System.out.println(a1.sum(20, 30));		
	}
}

 
