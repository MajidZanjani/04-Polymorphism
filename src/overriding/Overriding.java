package overriding;

public class Overriding {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Car();
		
		System.out.println("v1: " + v1.vehicleSuperName());
		System.out.println("v1: " + v1.vehicleSubName());
		
		System.out.println("\nv2: " + v2.vehicleSuperName());
		System.out.println("v2: " + v2.vehicleSubName());

	}

}
