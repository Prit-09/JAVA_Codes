package InheritanceAbstract1;

public abstract class Shape {
	private double area;

	public Shape() {
		super();
		this.area = 0.0;
	}

	public Shape(int area) {
		super();
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
	abstract public double area();
	
}
