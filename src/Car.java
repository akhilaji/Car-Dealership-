import java.util.Random;

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
		vin = generateVin();
		
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	private int  generateVin() {
		Random rand = new Random();
		vin = rand.nextInt(100000)+1000;		
		return vin;
		
		
	}

	public void createCar(String name, String color, int seats, int price) {
		
	}

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
		String color = "white";
		return color;
	}
	
	@Override
	public String toString(Car car) {
		return "Car name: " +car.name+ " Car color: " +car.color+ " Number of seats: " +car.seats +" Price: $" +car.price ;
		
	}

}
