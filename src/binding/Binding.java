package binding;

class Binding {

	public static class Superclass {
		
		// Comment this line to make it dynamic binding.
		
		static void display() {
			
		// UnComment this line to make it dynamic binding.
		// void display() {
			
			System.out.println("Superclass is called");
		}
	}

	public static class Subclass extends Superclass {
		
		// UnComment this line to make it dynamic binding.
		//@Override
		
		// Comment this line to make it dynamic binding.
		
		static void display() {
		
		// UnComment this line to make it dynamic binding.
		//void display() {
			
			System.out.println("Subclass is called");
		}
	}

	public static void main(String[] args) {

		Superclass superclass = new Superclass();
		Superclass subclass = new Subclass();

		superclass.display();
		subclass.display();
	}

}
