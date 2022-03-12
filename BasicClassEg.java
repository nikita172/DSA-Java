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
	
}
public class BasicClassEg {
	public static void main(String args[]) {
		Animal a1= new Animal();
		Animal a2= new Animal();
		a1.color="red";
		a1.legs=4;
		a1.type="dog";
		a1.details();
		
	}
}
/*

 //this is same as the upper one
 class Animal {
	String color;
	int legs;
	String type;
	
	// making constructor
	Animal(String color,int legs,String type ){
		this.color= color;
		this.legs=legs;
		this.type=type;
	
	}
	public void details() {
		System.out.println("Animal is "+type);
		System.out.println("color is "+ color);
		System.out.println("no.of legs "+ legs);
	}
	
}
public class BasicClassEg {
	public static void main(String args[]) {
		Animal a1= new Animal("black",4,"cat");
		Animal a2= new Animal("white",4, "dog");
		a1.details();
		a2.details();
		
		
	}
}
*/
 
