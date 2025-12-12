package ej1_5;

public class Punto {
	
	private double x,y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distancia(Punto p) {
		//Coordenadas del punto que llama al método:x,y
		//Coordenadas del punto prámetro p.getX(),p.getY()
		double dif = (x-p.getX())*(x-p.getX()) + (y-p.getY())*(y-p.getY());
		return Math.sqrt(dif);
	}
	
}
