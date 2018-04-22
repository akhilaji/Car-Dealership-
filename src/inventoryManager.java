//import java.util.ArrayList;
import java.util.LinkedList;

public class inventoryManager extends dealershipManager{
	LinkedList<Car> fleet = new LinkedList<Car>();	
	dealershipManager x = new dealershipManager ();
	Car c = new Car();
	
	
	public String toString(int index) {
		//c.toString(fleet.get(0));
		return c.toString(fleet.get(0));
		
	}
	
	public void sortPrice() {
		Car swap1 = new Car();
		Car swap2 = new Car();
		int vin1 = 0;
		int vin2 = 0;
		
		for(int i = 0; i < fleet.size()-1; i++) {
			swap1 = fleet.get(i);
			swap2 = fleet.get(i+1);
			
			vin1 = swap1.getPrice();
			vin2 = swap2.getPrice();
			
			if(vin1<vin2) {
				fleet.set(i, swap2);
				fleet.set(i+1, swap1);
			}
			i++;
		}
		
	}
	
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
			i++;
		}
		
	}
	
}
