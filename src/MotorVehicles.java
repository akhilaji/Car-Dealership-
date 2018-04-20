import java.util.ArrayList;

/**
 * 
 */

/**
 * @author akhilaji
 *
 */
public abstract class MotorVehicles {

	/**
	 * 
	 */
	public MotorVehicles() {
		// TODO Auto-generated constructor stub
	}
	
	abstract public String getName();
	abstract public String getColor();
	abstract public int getSeats();
	abstract public int getPrice();
	
	static ArrayList<MotorVehicles> fleet = new ArrayList<MotorVehicles>();

}
