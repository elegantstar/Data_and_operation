package inheritance;

public class TaxiApp {
	public static void main(String[] args) {
		/*
		 *����� ���� : �ڵ带 ���� �� �ִ�. 
		 *����� ���� : ���� ����� �Ұ����ϴ�.
		 */
		Taxi taxi1 = new Taxi("Yellow", "Hyudai", 5, 160, 3800, "Korea", 300);
		
		//taxi1�� Car�� getter, methods�� ���� ����
		System.out.println(taxi1.getColor());
		taxi1.drive(); // method overriding
		
		//taxi�� ���
		taxi1.pickUp(2, 3);
		taxi1.drive();
		taxi1.dropOff();
		
		System.out.println(taxi1.getRevenue());


		/**
		 * ������(polymorphism) : �ϳ��� ��ü�� ���� Ÿ������ ��ȯ�� �� �ִ�.
		 */
		
		Car car = taxi1; //��ĳ���� UpCasting, ����� ���� ���� ���� ������ ĳ�����ϴ� �� �ڵ����� ����
		car.drive();
		
		Object obj = car; // Object(��� Ŭ������ �ֻ��� �θ�)�� Car�� �θ� Ŭ����, Up Casting
		
		Taxi taxi2 = (Taxi) car; //�ٿ�ĳ���� DownCasting, ����� ���� ���� ���� ������ ĳ�����ϴ� ���� �ڵ����� �� ��
		System.out.println(taxi2.isEmpty());
	}
}
