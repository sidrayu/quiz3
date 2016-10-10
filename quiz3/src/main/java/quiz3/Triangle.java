package quiz3;

public class Triangle extends GeometricObject{
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	public Triangle(){
	}
	
	public Triangle(double side1, double side2, double side3){
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
		return area;
	}
	
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		String description = "The triangle has sides "+side1+" ,"+side2+", and "+ side3+
				".  The area of the triangel is" +getArea() + 
				".  The permeter of the triangel is " +getPerimeter() +
				".  The color is" + getColor() +". The triangle is filled.";
		return description;
	}
	
}
