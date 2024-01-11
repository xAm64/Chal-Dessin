package fr.fms.entities;

public class Point {
	
	//variables
	private int x;
	private int y;
	
	//constructeur
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Accesseurs
	//getters
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	//seters
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
