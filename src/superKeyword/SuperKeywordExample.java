package superKeyword;

class User {
	int id;
	String name;
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}	
}

class Teacher extends User {
	String teachingCourse;
	public Teacher(int id, String name, String teachingCourse) {
		super(id, name);
		this.teachingCourse = teachingCourse;
	}	
	void display() {
		System.out.println(id + ", " + name + ", " + teachingCourse);
	}
}

class Student extends User {
	String className;
	public Student(int id, String name, String className) {
		super(id, name);
		this.className = className;
	}
	void display() {
		System.out.println(id + ", " + name + ", " + className);
	}
}

public class SuperKeywordExample {

	public static void main(String[] args) {

		Teacher teacher = new Teacher(11, "Ms. Natia", "German Language");
		Student student = new Student(22, "Sahand", "Individual Class");
		
		teacher.display();
		student.display();
		
	}

}
