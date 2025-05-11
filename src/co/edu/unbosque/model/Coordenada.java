package co.edu.unbosque.model;

public class Coordenada {
    
	private int fila;
    private int columna;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() { return fila; }
    public int getColumna() { return columna; }

    public void mover(int deltaFila, int deltaColumna) {
        this.fila += deltaFila;
        this.columna += deltaColumna;
    }
}
