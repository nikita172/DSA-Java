package oopsConcept;

public class CopyConstructor {
	String name;
	int age;
	public void info() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	CopyConstructor( CopyConstructor cp2){
		this.name=cp2.name;
		this.age=cp2.age;
	}
	CopyConstructor() {
		
	}
	public static void main(String args[]) {
		CopyConstructor cp1 = new CopyConstructor();
		cp1.name="nikita";
		cp1.age=21;
		
		CopyConstructor cp2 =new CopyConstructor(cp1);
		cp2.info();

	}
	
}
