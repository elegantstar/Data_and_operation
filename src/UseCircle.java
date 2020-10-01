
public class UseCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setName("circle1");
		circle.setRadius(3);
		circle.setXpos(4);
		circle.setYpos(1);
	
		System.out.println(circle.getName());
		System.out.println(circle.getRadius());
		System.out.println(circle.getXpos());
		System.out.println(circle.getYpos());
		
		System.out.println(circle.toString());
		
		Circle circle2 = new Circle(3, 2, 5);
		System.out.println(circle2.toString());
		
		System.out.println(circle.getArea());
		System.out.println(circle2.getArea());
	}

}
