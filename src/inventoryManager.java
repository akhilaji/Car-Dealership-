//import java.util.ArrayList;
import java.util.LinkedList;

/*
 * CSE 205: <Class 17566> / <Monday/Wednesday 4:35pm> 
 * Assignment: <assignment 6>
 * Author(s): <Akhil Aji> & <1212811299>,
 * Description: <CMain User Interaction>
 */

//Creates new linked list to store Car objects
public class inventoryManager extends dealershipManager{
	LinkedList<Car> fleet = new LinkedList<Car>();	
	//create a new instance of main and car to access methods
	dealershipManager x = new dealershipManager ();
	Car c = new Car();
	
	
	public String toString(int index) {
		//c.toString(fleet.get(0));
		return c.toString(fleet.get(0));
		
	}
	//Sorts Cars by ascending Price  
	public void sortPrice() {
		Car swap1 = new Car();
		Car swap2 = new Car();
		int price1 = 0;
		int price2 = 0;
		
		for(int i = 0; i < fleet.size()-1; i++) {
			swap1 = fleet.get(i);
			swap2 = fleet.get(i+1);
			
			price1 = swap1.getPrice();
			price2 = swap2.getPrice();
			
			if(price1<price2) {
				fleet.set(i, swap2);
				fleet.set(i+1, swap1);
			}
			
		}
		
	}
	//Sorts Cars by ascending Vin numbers 
	public void sortByVin() {
		Car swap1 = new Car();
		Car swap2 = new Car();
		int vin1 = 0;
		int vin2 = 0;
		
		for(int i = 0; i < fleet.size()-1; i++) {
			swap1 = fleet.get(i);
			swap2 = fleet.get(i+1);
			
			vin1 = swap1.getVin();
			vin2 = swap2.getVin();
			
			if(vin1> vin2) {
				fleet.set(i, swap2);
				fleet.set(i+1, swap1);
			}
			
		}
		
	}
	
}
