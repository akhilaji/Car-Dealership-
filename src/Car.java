
public  class Car extends MotorVehicles {

	String name;
	String color;
	int seats;
	int price;
	
	public Car(String name, String color, int seats, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.color = color;
		this.seats = seats;
		this.price = price;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int getSeats() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		String color = "white";
		return color;
	}
	
	public String toString() {
		return "Car name: " +name+ "Car color: " +color+ "Number of seats: " +seats +"Price: " +price ;
		
	}

}
