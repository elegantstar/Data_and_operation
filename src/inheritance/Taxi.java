package inheritance;

// Taxi�� Car�� ��� ����
public class Taxi extends Car {
//	private String color;
//	private String manufacturer;
//	private int seats;
//	private double maxSpeed;
	
	private int basicRate; //�⺻���
	private boolean isEmpty = true;
	private String company;
	private int numOfPassengers; //ž�°� ��
	private int rate; //���
	private int revenue = 0; // ����
	private int distance = 0; // �̵��Ÿ�
	private int ratePerDistance;
	
	public Taxi(String color, String manufacturer, int seats, double maxSpeed, int basicRate, String company,
			int ratePerDistance) {

//		setColor(color);
//		setManufacturer(manufacturer);
//		setSeats(seats);
//		setMaxSpeed(maxSpeed);
		super(color, manufacturer, seats, maxSpeed); //�θ�(Car)�� ������ ȣ�� <-> ������ ������ ȣ���� this(...)
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
	 * �޼ҵ� �����ε� : ������ �̸��� �޼ҵ带 ���� �� �����ϴ� ���(�Ű������� Ÿ��, �Ű������� ����, �Ű������� ������ �ϳ��� �޶�� ��) -> Flexible
	 * �޼ҵ� �������̵� : �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� ������
	 */
	
	@Override
	public void drive() {
		if(!isEmpty) {
			System.out.println("���� ��");
		} else {
			System.out.println("�� ��");
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
