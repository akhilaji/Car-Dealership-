import java.util.Random;

/*
 * CSE 205: <Class 17566> / <Monday/Wednesday 4:35pm> 
 * Assignment: <assignment 6>
 * Author(s): <Akhil Aji> & <1212811299>,
 * Description: <Car class conatains methods required to make a car object>
 */

public  class Car extends dealershipManager {

	//instance variables
	private String name;
	private String color;
	private int seats;
	private int price;
	private int vin = 0;
	//static ArrayList<Car> fleet = new ArrayList<Car>();
	
	
	//car constructor
	//create a new car with a random Vin
	public Car(String name, String color, int seats, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.color = color;
		this.seats = seats;
		this.price = price;
		//creates random vin 
		vin = generateVin();
		
	}
	
	//default constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}

	//Assigns each new car a random Vin number using a random number generator
	private int  generateVin() {
		Random rand = new Random();
		vin = rand.nextInt(100000)+1000;		
		return vin;
		
		
	}


	//Getter Methods for Variable Access
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	
	public int getSeats() {
		// TODO Auto-generated method stub
		return seats;
	}
	
	
	public String getColor() {
		// TODO Auto-generated method stub
		
		return color;
	}
	
	public int getVin() {
		// TODO Auto-generated method stub
		return vin;
	}
	
	//toString to return formatted Car object information
	@Override
	public String toString(Car car) {
		return "VIN # "+car.vin +" Car name:" +car.name+ " Car color:" +car.color+ " Number of seats:" +car.seats +" Price: $" +car.price +"\n" ;
		
	}

}
