package rece2;

import Entidades.Juego.Juego;
import Entidades.Juego.Jugador;
import Entidades.Juego.Revolver;
import java.util.ArrayList;
import java.util.List;

public class RECE2 {

    public static void main(String[] args) {
        //CREACION DE PARTICIPANTES
        Jugador p1 = new Jugador("ivan", 1, null);
        Jugador p2 = new Jugador("ivana", 2, null);
        Jugador p3 = new Jugador("ana", 3, null);
        Jugador p4 = new Jugador("analia", 4, null);
        Jugador p5 = new Jugador("lia", 5, null);
        Jugador p6 = new Jugador("vavi", 6, null);
        //CREACION DE LA PISTOLITA
        Revolver r = new Revolver();  
        //CARGA DE PARTICIPANTES
        List<Jugador> jugadores = new ArrayList();
        jugadores.add(p1);
        jugadores.add(p2);
        jugadores.add(p3);
        jugadores.add(p4);
        jugadores.add(p5);
        jugadores.add(p6);        
        //QUE COMIENCE EL JUEGO!!!!
        Juego j = new Juego();        
        j.llenarJuego(jugadores, r);        
        j.ronda();
    }

}
