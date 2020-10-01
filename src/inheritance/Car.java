package inheritance;

// Java Bean : Field, Getter/Setter, Constructor만 존재하는 클래스(객체)
public class Car {
	private String color;
	private String manufacturer;
	private int seats;
	private double maxSpeed;
	
	public String getColor() {
		return color;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getSeats() {
		return seats;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String color, String manufacturer, int seats, double maxSpeed) {
		this.color = color;
		this.manufacturer = manufacturer;
		this.seats = seats;
		this.maxSpeed = maxSpeed;
	}
	public Car() {
	}
	
	public void drive() {
		System.out.println("drive");
	}
	public void stop() {
		System.out.println("stop");
	}
}
