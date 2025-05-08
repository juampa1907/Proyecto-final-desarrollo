package co.edu.unbosque.model;

public class Semaforo {

	private Coordenada ubicacion;
	private String color;
	
	public Semaforo(Coordenada ubicacion, String color) {
		super();
		this.ubicacion = ubicacion;
		this.color = color;
	}

	public Coordenada getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Coordenada ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
