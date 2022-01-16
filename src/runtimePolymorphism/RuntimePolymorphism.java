package runtimePolymorphism;

class Material {
	String name = null;
	void displayName(){
		System.out.println(this.name);
	}
}

class Iron extends Material {
	String name = "Iron";
	void displayName(){
		System.out.println(this.name);
	}
}

class Wood extends Material {
	String name = "Wood";
	void displayName(){
		System.out.println(this.name);
	}
}	

public class RuntimePolymorphism {

public static void main(String[] args) {

		Material m1 = new Iron(); // This is Runtime Polymorphism. Because it invokes by the JVM in the runtime.
		Material m2 = new Wood(); // This is Runtime Polymorphism. Because it invokes by the JVM in the runtime.
		
		m1.displayName();
		m2.displayName();

	}

}
