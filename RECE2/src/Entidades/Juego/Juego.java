package Entidades.Juego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Juego {

    private List<Jugador> jugadores;
    private Revolver R;

    public Juego() {
        this.jugadores = new ArrayList();
    }

    public void llenarJuego(List<Jugador> j, Revolver r) {
        this.jugadores = j;
        this.R = r;
    }

    public void ronda() {
        R.llenarRevolver();
        System.out.println(R.toString());
       // Collections.shuffle(jugadores);
        for (Jugador part : jugadores) {
            System.out.println(part.getNombre()+" "+part.getId());
            Boolean d = part.disparo(R);
            if (d) {
                part.setMojado(d);
                System.out.print("\n"+part.getNombre());
                System.out.println(" Fue Mojad@\n");
                break;
            }else{
                part.setMojado(d);
            }
        }
        System.out.println(R.toString());
        for (Jugador jugad : jugadores) {
            System.out.println(jugad.toString());
        }
        
        
    }
}
