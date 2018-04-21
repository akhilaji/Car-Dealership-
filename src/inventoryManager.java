import java.util.ArrayList;

public class inventoryManager extends dealershipManager{
	ArrayList<Car> fleet = new ArrayList<Car>();	
	dealershipManager x = new dealershipManager ();
	Car c = new Car();
	
	public String toString(int index) {
		//c.toString(fleet.get(0));
		return c.toString(fleet.get(0));
		
	}
	
	public void sortPrice() {
		
	}
	
}
