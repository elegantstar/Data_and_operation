package interface_app;

public class MyInterfaceTaxiApp {

	public static void main(String[] args) {
		
		MyInterfaceTaxiImpl taxi = new MyInterfaceTaxiImpl();
		
		taxi.drive(); // Car�� ���
		taxi.pickUp(5, 100); // Taxi�� ���
		taxi.dropOff(); // Taxi�� ���
		
		
		/**
		 * �������̽��� ���� �߿��� ���
		 * : ����ڷ� �Ͽ��� ����� �� �ִ� ����� �����Ѵ�. (�������̽��� ���ǵ� �޼ҵ常 ��� ����)
		 */
		MyInterfaceTaxi interfaceTaxi = taxi;
		taxi.pickUp(5, 100); // Overriding�� �� Methods�� Up Casting �ÿ��� �״�� ����
		interfaceTaxi.dropOff(); // Overriding�� �� Methods�� Up Casting �ÿ��� �״�� ����
		
		MyInterfaceCar interfaceCar = taxi;
		interfaceCar.drive();
	}

}
