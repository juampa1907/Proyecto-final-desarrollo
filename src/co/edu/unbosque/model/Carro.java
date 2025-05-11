package co.edu.unbosque.model;

public class Carro {
	private int id;
	private Coordenada posicion;
	private int velocidad;
	private String estado;
		
	public Carro(int id, Coordenada posicion, String estadoInicial) {
		this.id = id;
		this.posicion = posicion;
		this.velocidad = 1;
		this.estado = estadoInicial;
	}
		
	public void avanzar() {
		if (estado.equals("Avanzando")) {
			posicion.mover(0, 1);
	        }
	}
	
	public void detener() {
		estado = "Detenido";
	}
	
	public String getEstado() { return estado; }
	public Coordenada getPosicion() { return posicion; }
	public int getId() { return id; }
	}
