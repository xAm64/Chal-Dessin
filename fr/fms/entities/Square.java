package fr.fms.entities;

public class Square extends Shape {

	private int side;

	public Square(int side, int x, int y) {
		super(x, y);
		this.setSide(side);
	}

	public Square(int side, Point center) {
		super(center);
		setSide(side);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		if (side < 0)
			side = 1;
		else
			this.side = side;
	}

	public double area() {
		return this.side * this.side;
	}

	public double perimenter() {
		return 4 * side;
	}

	@Override
	public String toString() {
		return "square side : " + side + ", " + super.toString();
	}

}
