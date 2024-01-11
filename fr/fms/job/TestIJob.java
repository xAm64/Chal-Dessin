package fr.fms.job;

import fr.fms.entities.Circle;
import fr.fms.entities.Point;
import fr.fms.entities.Square;
import fr.fms.graphic.Graphic;

public class TestIJob {

	public static void main(String[] args) {
		
		IJobImpl job = new IJobImpl();
		job.addShape(1, new Circle(2, new Point(5,5)));
		job.addShape(2, new Square(5, new Point(10,7)));
		job.addShape(3, new Circle(1.6, 5, 2));
		job.addShape(4, new Square(3, 75, 25));
		job.addShape(5, new Circle(6, new Point(100,150)));
		
		job.displayAll();
		System.out.println("\n---------------------\n");
		
		job.deleteShape(3);
		job.moveShape(5, 200, 250);
		job.displayAll();
		
		Graphic draw = new Graphic();
		
		//job.drawShape(2, draw);

	}

}
