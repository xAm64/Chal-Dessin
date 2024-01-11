package fr.fms.entities;

public abstract class Shape {
	//Attributes
	private Point center; 
	 
	//Constructors
	public Shape(int x, int y) {
		this.setCenter(new Point(x,y));
	}
	
	public Shape(Point center) {
		this.center = new Point(center.getX(), center.getY());
	}
	
	//Method
	public abstract double area();
	
	public abstract double perimeter();

	@Override
	public String toString() {
		return "Shape [center = " + getCenter() + "]";
	}

	//Setters and Getters
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

}
