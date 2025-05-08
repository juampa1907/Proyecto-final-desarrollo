package co.edu.unbosque.model;

import java.util.List;

public class Ciudad {

	private int[][] plano;
	private int turnoActual;
	private List<Calle> calles;
	private List<Carro> carros;
	private List<Semaforo> semaforos;
	
	public Ciudad(int[][] plano, int turnoActual, List<Calle> calles, List<Carro> carros, List<Semaforo> semaforos) {
		super();
		this.plano = plano;
		this.turnoActual = turnoActual;
		this.calles = calles;
		this.carros = carros;
		this.semaforos = semaforos;
	}

	public int[][] getPlano() {
		return plano;
	}

	public void setPlano(int[][] plano) {
		this.plano = plano;
	}

	public int getTurnoActual() {
		return turnoActual;
	}

	public void setTurnoActual(int turnoActual) {
		this.turnoActual = turnoActual;
	}

	public List<Calle> getCalles() {
		return calles;
	}

	public void setCalles(List<Calle> calles) {
		this.calles = calles;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public List<Semaforo> getSemaforos() {
		return semaforos;
	}

	public void setSemaforos(List<Semaforo> semaforos) {
		this.semaforos = semaforos;
	}
	
	
	
}
