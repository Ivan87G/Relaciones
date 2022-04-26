package Entidades.Juego;

public class Revolver {

    private Integer pactual;
    private Integer pcarga;

    public Revolver() {
    }

    public void llenarRevolver() {
        pactual = (int) Math.floor(Math.random() * 6 + 1);
        pcarga = (int) Math.floor(Math.random() * 6 + 1);
    }

    public boolean mojar() {
        boolean activar;
        activar = pactual.equals(pcarga);
        return activar;
    }

    public void siguienteChorro() {
        if (pactual < 6) {
            pactual += 1;
        } else {
            pactual = 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "Posicion Actual = " + pactual + ", Posicion de la Carga = " + pcarga + '}';
    }

}
