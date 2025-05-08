package co.edu.unbosque.model;

public class Carro {

	private int idCarro; 
	private Coordenada posicion;
	private int velocidad;
	
	public Carro(int idCarro, Coordenada posicion, int velocidad) {
		super();
		this.idCarro = idCarro;
		this.posicion = posicion;
		this.velocidad = velocidad;
	}

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public Coordenada getPosicion() {
		return posicion;
	}

	public void setPosicion(Coordenada posicion) {
		this.posicion = posicion;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
}
