package Entidades.Juego;

public class Jugador {    
    private String nombre;
    private Integer id;
    private Boolean mojado;    

    public Jugador() {
      
    }    

    public Jugador(String nombre, Integer id, Boolean mojado) {
        this.nombre = nombre;
        this.id = id;
        this.mojado = mojado;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return '{' + "nombre=" + nombre + ", id=" + id + ", mojad@=" + mojado + '}';
    }   

    public boolean disparo(Revolver r) {
        
        Boolean d = r.mojar();
        if(!d){
            r.siguienteChorro();
        }
        
        return d;

    }

}
