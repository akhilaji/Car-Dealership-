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
		
	}
	
}
