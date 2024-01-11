package fr.fms.entities;

public class Shape {
	private Point center; 
	 
	public Shape(int x, int y) {
		this.setCenter(new Point(x,y));
	}
	
	public Shape(Point center) {
		this.center = new Point(center.getX(), center.getY());
	}
	
	@Override
	public String toString() {
		return "Shape [center = " + getCenter() + "]";
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
}
