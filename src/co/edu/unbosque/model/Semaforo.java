package co.edu.unbosque.model;

public class Semaforo {
    private Coordenada ubicacion;
    private String color;
    private int contadorTurnos;

    public Semaforo(Coordenada ubicacion) {
        this.ubicacion = ubicacion;
        this.color = "Rojo";
        this.contadorTurnos = 0;
    }

    public void cambiarEstado() {
        contadorTurnos++;
        if (contadorTurnos % 2 == 0) {
            color = color.equals("Rojo") ? "Verde" : "Rojo";
        }
    }

    public boolean esRojo() {
        return color.equals("Rojo");
    }

    public String getColor() { return color; }
    public Coordenada getUbicacion() { return ubicacion; }
}

