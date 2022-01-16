package instanceInitializer;

class A {
	public A() {
		System.out.println("Paretn class constractor has been invoked.");
	}
	
	{System.out.println("Instance initializer block of parent has been invoked");} // This is the Initializer Block.
}

class B extends A {
	public B() {
		System.out.println("Child class constractor has been invoked.");
	}
	
	{System.out.println("Instance initializer block of child has been invoked");} // This is the Initializer Block.
}

public class InstanceInitializer {

	public static void main(String[] args) {

		B b = new B();
		
	}

}
