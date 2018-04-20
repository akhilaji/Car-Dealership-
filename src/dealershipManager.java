import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author akhilaji
 *
 */
public abstract class dealershipManager extends MotorVehicles{

	/**
	 * 
	 */
	public dealershipManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MotorVehicles> car = new ArrayList<MotorVehicles>();
		Scanner scan = new Scanner(System.in);
		String input;
		char command;
		String name;
		String color;
		int seats;
		int price;

		System.out.println("Welcome to the Dealership!");
		System.out.println("Type A to Add new Car to inventory");
		System.out.println("Type B to Print current Inventory");
		System.out.println("Type C to Sort current Inventory");
		System.out.println("Type D to display the Menu");
		System.out.println("Type Q to quit");
		
		
		boolean display = true;
		while(display !=false) {
			input = scan.next();
			command = input.charAt(0);
			switch(command) {
			case 'A':
				System.out.print("Enter Car Name: ");
				name = scan.next();
				System.out.print("Enter Car Color: ");
				color = scan.next();
				System.out.print("Enter the Number of Seats: ");
				seats = scan.nextInt();
				System.out.print("Enter Car Price: ");
				price = scan.nextInt();
				
				Car car1 = new Car( name,  color,  seats,  price);
				fleet.add(car1);
				System.out.println("Enter next command");
				
				break;
			case 'B':
				for(int i = 0; i < fleet.size(); i++) {
					MotorVehicles car2 = fleet.get(i);
					
				}
				System.out.println("Enter next command");
				break;
			case 'C':
				System.out.println("Enter next command");
				break;
			case 'D':
				System.out.println("Enter next command");
				break;
			case 'Q':
				System.out.println("Closing");
				display = false;
				break;
			
			default:
				System.out.println("Invalid Choice");
				break;
				
			
			}
			
		}
		
		
		
		
		

	}
	
	private static void printStats(ArrayList<MotorVehicles> car) {
		if(car == null) {
			//Print There are no Cars 
			System.out.println("The dealership does not have any cars");
		}
	}
	

}

