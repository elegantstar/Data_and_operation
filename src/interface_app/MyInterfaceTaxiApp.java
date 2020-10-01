package interface_app;

public class MyInterfaceTaxiApp {

	public static void main(String[] args) {
		
		MyInterfaceTaxiImpl taxi = new MyInterfaceTaxiImpl();
		
		taxi.drive(); // Car의 기능
		taxi.pickUp(5, 100); // Taxi의 기능
		taxi.dropOff(); // Taxi의 기능
		
		
		/**
		 * 인터페이스의 가장 중요한 기능
		 * : 사용자로 하여금 사용할 수 있는 기능을 제한한다. (인터페이스에 정의된 메소드만 사용 가능)
		 */
		MyInterfaceTaxi interfaceTaxi = taxi;
		taxi.pickUp(5, 100); // Overriding이 된 Methods는 Up Casting 시에도 그대로 동작
		interfaceTaxi.dropOff(); // Overriding이 된 Methods는 Up Casting 시에도 그대로 동작
		
		MyInterfaceCar interfaceCar = taxi;
		interfaceCar.drive();
	}

}
