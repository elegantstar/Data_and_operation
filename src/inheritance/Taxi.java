package inheritance;

// Taxi가 Car를 상속 받음
public class Taxi extends Car {
//	private String color;
//	private String manufacturer;
//	private int seats;
//	private double maxSpeed;
	
	private int basicRate; //기본요금
	private boolean isEmpty = true;
	private String company;
	private int numOfPassengers; //탑승객 수
	private int rate; //요금
	private int revenue = 0; // 수익
	private int distance = 0; // 이동거리
	private int ratePerDistance;
	
	public Taxi(String color, String manufacturer, int seats, double maxSpeed, int basicRate, String company,
			int ratePerDistance) {

//		setColor(color);
//		setManufacturer(manufacturer);
//		setSeats(seats);
//		setMaxSpeed(maxSpeed);
		super(color, manufacturer, seats, maxSpeed); //부모(Car)의 생성자 호출 <-> 본인의 생성자 호출은 this(...)
		this.basicRate = basicRate;
		this.company = company;
		this.ratePerDistance = ratePerDistance;
	}

	public void pickUp(int numOfPassengers, int distance) {
		if(numOfPassengers > 0) {
			this.numOfPassengers = numOfPassengers;
			isEmpty = false;
			rate = basicRate;
			this.distance = distance;
		}
	}
	
	public void dropOff() {
		if(!isEmpty) {
			calculateRate();
			numOfPassengers = 0;
			isEmpty = true;
			revenue += rate;
			rate = basicRate;
		}
	}
	
	/*
	 * 메소드 오버로딩 : 동일한 이름의 메소드를 여러 개 정의하는 기술(매개변수의 타입, 매개변수의 개수, 매개변수의 순서가 하나라도 달라야 함) -> Flexible
	 * 메소드 오버라이딩 : 부모 클래스의 메소드를 자식 클래스에서 재정의
	 */
	
	@Override
	public void drive() {
		if(!isEmpty) {
			System.out.println("영업 중");
		} else {
			System.out.println("빈 차");
		}
		
	}
	
	private void calculateRate() {
		rate += distance * ratePerDistance;
	}

	public int getBasicRate() {
		return basicRate;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public String getCompany() {
		return company;
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public int getRate() {
		return rate;
	}

	public int getRevenue() {
		return revenue;
	}

	public int getDistance() {
		return distance;
	}

	public int getRatePerDistance() {
		return ratePerDistance;
	}
	
	
	
	
	

	
}
