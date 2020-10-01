package inheritance;

public class TaxiApp {
	public static void main(String[] args) {
		/*
		 *상속의 장점 : 코드를 줄일 수 있다. 
		 *상속의 단점 : 다중 상속이 불가능하다.
		 */
		Taxi taxi1 = new Taxi("Yellow", "Hyudai", 5, 160, 3800, "Korea", 300);
		
		//taxi1이 Car의 getter, methods를 갖고 있음
		System.out.println(taxi1.getColor());
		taxi1.drive(); // method overriding
		
		//taxi의 기능
		taxi1.pickUp(2, 3);
		taxi1.drive();
		taxi1.dropOff();
		
		System.out.println(taxi1.getRevenue());


		/**
		 * 다형성(polymorphism) : 하나의 객체가 여러 타입으로 변환될 수 있다.
		 */
		
		Car car = taxi1; //업캐스팅 UpCasting, 기능이 많은 것을 작은 것으로 캐스팅하는 건 자동으로 가능
		car.drive();
		
		Object obj = car; // Object(모든 클래스의 최상위 부모)는 Car의 부모 클래스, Up Casting
		
		Taxi taxi2 = (Taxi) car; //다운캐스팅 DownCasting, 기능이 없는 것을 많은 것으로 캐스팅하는 것은 자동으로 안 됨
		System.out.println(taxi2.isEmpty());
	}
}
