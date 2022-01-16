package covariantReturnType;


// There's no need to use the annotation @Override here in this example.
// It's just to show how it works.
// Code will run without any error deleting this annotation.

class Human {
	Human foo() {
		return this;
	}
	
	void display() {
		System.out.println("This is a Human class.");
	}
}

class Woman extends Human {
	
	@Override
	Human foo( ) {
		return this;
	}
	
	@Override
	void display() {
		System.out.println("This is a Woman class.");
	}
}

class Girl extends Woman {
	
	@Override
	Woman foo( ) {
		return this;
	}
	
	@Override
	void display() {
		System.out.println("This is a Girl class.");
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.display();
		
		Woman woman = new Woman();
		woman.display();
		
		Girl girl = new Girl();
		girl.display();
		
	}

}
