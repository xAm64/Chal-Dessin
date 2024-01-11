package fr.fms.job;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;

public class IJobImpl implements IJob {
	
	private Map<Integer, Shape> shapes;
	
	public IJobImpl() {
		shapes = new HashMap<>();
	}

	@Override
	public void addShape(int id, Shape shape) {
		shapes.put(id, shape);
	}
	@Override
	public void deleteShape(int id) {
		shapes.remove(id);
	}
	@Override
	public Shape getShapeById(int id) {
		return shapes.get(id);
	}
	@Override
	public void moveShape(int id, int x, int y) {
		Shape shape = getShapeById(id);
		shape.getCenter().setX(x);
		shape.getCenter().setY(y);
	}
	
	@Override
	public void drawShape(int id, Graphics g) {
		Shape shape = getShapeById(id);
		g.fillRect(shape.getCenter().getX(), shape.getCenter().getY()
				, ((Square) shape).getSide(), ((Square) shape).getSide());
		
	}
	
	@Override
	public void displayAll() {
		for(Shape s : shapes.values()) {
			System.out.println(s);
		}
	}

}
