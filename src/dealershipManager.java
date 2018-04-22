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
		
		//create Scanner for user input
		Scanner scan = new Scanner(System.in);
		
		//initialize Variables
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
		
		//As long as "Q" is not pressed this loop displays the menu
		boolean display = true;
		while(display !=false) {
			input = scan.next();
			command = input.charAt(0);
			switch(command) {
			//This case creates a new car and adds to array
			case 'A':
				scan.nextLine();
				//Prompt the user to enter information about the car
				System.out.print("Enter Car Name: ");
				name = scan.nextLine();
				
				System.out.print("Enter Car Color: ");
				color = scan.next();
				
				System.out.print("Enter the Number of Seats: ");
				seats = scan.nextInt();
				
				System.out.print("Enter Car Price: ");
				price = scan.nextInt();
				
				//creates new car object and adds to the Fleet list
				car = new Car( name,  color,  seats,  price);
				m.fleet.add(car);
					
				System.out.println("Enter next command");
				
				break;
			
			//This case prints out the current list 
			case 'B':
				System.out.println("Current Inventory");
				//Store list size to track array position
				int size = 0; 
				size = m.fleet.size();
				
				for(int i = 0; i<size; i++) {
					//create a temp car to store the car object later used to call 
					//the Car class's toString method.
					
					car = m.fleet.get(i);
					System.out.print(car.toString(car));	
				}
				System.out.println("");
				
				System.out.println("Enter next command");
				break;
			//This case gives the user options for sorting their list
			case 'C':				
				m.sortPrice();				
				System.out.print("Sorted, Enter B To View Sorted List");

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
		System.out.println("Type C to Sort current Inventory By Price");
		System.out.println("Type D to display the Menu");
		System.out.println("Type Q to quit");
		
		
	}

	//TEMP
//	static void printStats(ArrayList<Car> car) {
//		if(car == null) {
//			//Print There are no Cars 
//			System.out.println("The dealership does not have any cars");
//		}
//	}

	//Testing
	public String toString(Car car) {
		// TODO Auto-generated method stub
		return "Car name: " +car.getName()+ " Car color: " +car.getColor()+ " Number of seats: " +car.getSeats() +" Price: $" +car.getPrice() ;

	}

	


}

