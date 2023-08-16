import java.util.Scanner;

public class DistanceCalculator {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first time interval in seconds: ");
		int timeInterval1 = scanner.nextInt();
		System.out.println("Enter the second time interval in seconds: ");
		int timeInterval2 = scanner.nextInt();

		double initialVelocityKmph = 36.0; 
		double accelerationMps2 = 5.0;
		
		double initialVelocityMps = initialVelocityKmph * (1000.0/3600.0);
		
		double distance1 = initialVelocityMps * timeInterval1 + 0.5 * accelerationMps2 * timeInterval1 * timeInterval1;
		double distance2 = initialVelocityMps * timeInterval2 + 0.5 * accelerationMps2 * timeInterval2 * timeInterval2;

		System.out.println("Distance traveled in meters for the first time interval: "+distance1);
		System.out.println("Distance traveled in meters for the second time interval:"+distance2);


	}
}
