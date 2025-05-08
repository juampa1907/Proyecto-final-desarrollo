package co.edu.unbosque.model;

public class Evento {

	private String tipo;
	private int duracion;
	private Coordenada ubicacion;

	public Evento(String tipo, int duracion, Coordenada ubicacion) {
		super();
		this.tipo = tipo;
		this.duracion = duracion;
		this.ubicacion = ubicacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Coordenada getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Coordenada ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
