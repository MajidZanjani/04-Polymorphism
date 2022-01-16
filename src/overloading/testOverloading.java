package overloading;

public class testOverloading {
	
	public static String testMe(String data) {
		return data + " is String";
	}
	
	public static String testMe(int data) {
		return data + " is Integer Number";
	}

	public static String testMe(double data) {
		return data + " is Double Number";
	}

	public static String testMe(int data1, int data2) {
		return data1 + " & " + data2 +" are Integer Numbers";
	}
}
