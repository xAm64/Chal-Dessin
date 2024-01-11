package fr.fms.job;

import java.util.HashMap;
import java.util.Map;
import fr.fms.entities.Shape;

public class IJobImpl {
	
	private Map<Integer, Shape> shapes;
	
	public IJobImpl() {
		shapes = new HashMap<>();
	}

	
	public void addShape(int id, Shape shape) {
		shapes.put(id, shape);
	}
	
	public void deleteShape(int id) {
		shapes.remove(id);
	}
	
	public Shape getShapeById(int id) {
		return shapes.get(id);
	}
	
	public void moveShape(int id, int x, int y) {
		Shape shape = getShapeById(id);
		shape.getCenter().setX(x);
		shape.getCenter().setY(y);
	}
	
	public void drawShape() {
		
	}
	
	public void displayAll() {
		for(Shape s : shapes.values()) {
			System.out.println(s);
		}
	}

}
