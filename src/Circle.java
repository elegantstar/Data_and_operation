
public class Circle {
	int xpos;
	int ypos;
	int radius;
	String name;
	
	public void setXpos(int xpos) {
		this.xpos = xpos;
	}
	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getXpos() {
		return xpos;
	}
	public int getYpos() {
		return ypos;
	}
	public int getRadius() {
		return radius;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return xpos + "," + ypos + "," + radius + "," + name;
	}
	public Circle() {
	}
	public Circle(int xpos, int ypos, int radius) {
		this.xpos = xpos;
		this.ypos = ypos;
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
