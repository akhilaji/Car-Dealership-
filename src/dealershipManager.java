import java.util.ArrayList;
import java.util.Scanner;



/**
 * 
 */

/**
 * @author akhilaji
 *
 */
public class dealershipManager{

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String input;
		char command;
		String name;
		String color = null;
		int seats;
		int price = 0;
		//Instantiate a car object and a new Array
		Car car = new Car(color, color, price, price);
		inventoryManager m = new inventoryManager();

		//Print Menu
		printMenu();
		
		boolean display = true;
		while(display !=false) {
			input = scan.next();
			command = input.charAt(0);
			switch(command) {
			//This case creates a new car and adds to array
			case 'A':
				scan.nextLine();
				System.out.print("Enter Car Name: ");
				name = scan.nextLine();
				System.out.print("Enter Car Color: ");
				color = scan.next();
				System.out.print("Enter the Number of Seats: ");
				seats = scan.nextInt();
				System.out.print("Enter Car Price: ");
				price = scan.nextInt();
				car = new Car( name,  color,  seats,  price);
				
				m.fleet.add(car);
				
				
				System.out.println("Enter next command");
				
				break;
			
			//This case prints out the current list 
			case 'B':
				System.out.println("Current Inventory");
				int size = 0; 
				size = m.fleet.size();
				
				for(int i = 0; i<size; i++) {
					car = m.fleet.get(i);
					System.out.print(car.toString(car));	
				}
				System.out.println("");
				
				System.out.println("Enter next command");
				break;
			//This case gives the user options for sorting their list
			case 'C':
				System.out.print("Sorting Options");
				System.out.print("Sort by Price");
				System.out.print("Sort by Number of Seats");
				System.out.print("Sort by Car Name");
				System.out.print("Sort by Car Color");
				
				
				
				System.out.println("Enter next command");
				break;
			
			//This case prints the menu
			case 'D':
				printMenu();
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
	
	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Dealership!");
		System.out.println("Type A to Add new Car to inventory");
		System.out.println("Type B to Print current Inventory");
		System.out.println("Type C to Sort current Inventory");
		System.out.println("Type D to display the Menu");
		System.out.println("Type Q to quit");
		
		
	}

	static void printStats(ArrayList<Car> car) {
		if(car == null) {
			//Print There are no Cars 
			System.out.println("The dealership does not have any cars");
		}
	}

	public String toString(Car car) {
		// TODO Auto-generated method stub
		return "Car name: " +car.getName()+ " Car color: " +car.getColor()+ " Number of seats: " +car.getSeats() +" Price: $" +car.getPrice() ;

	}

	


}

