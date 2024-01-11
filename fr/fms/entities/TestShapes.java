package fr.fms.entities;

public class TestShapes {

	public static void main(String[] args) {
		
		Circle monCercle = new Circle(50, 15, 20);
		System.out.println(monCercle);
		System.out.println(monCercle.area());
		System.out.println(monCercle.perimeter());
		Square s1 = new Square(20, 20, 60);
		System.out.println(s1);
		System.out.println(s1.area());
		System.out.println(s1.perimeter());
		//Avec Shape devenu classe abstraite, impossible d'instancier la classe Shape.
		//Shape s2 = new Shape(2,3);
		//System.out.println(s2);
		
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(50, 15, 20);
		shapes[1] = new Circle(20, 150, 200);
		
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println(s.area());
		}
	}
}
