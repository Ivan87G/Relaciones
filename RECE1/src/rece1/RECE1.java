
package rece1;

import Entidades.adop.Perro;
import Entidades.adop.Persona;


public class RECE1 {

    
    public static void main(String[] args) {
       Perro pe1 = new Perro();
       Perro pe2 = new Perro();
        
       Persona p1 = new Persona();
       Persona p2 = new Persona();
       
       pe1.setNombre("lucking");
       pe1.setRaza("callejero");
       pe1.setEdad(2);
       pe1.setTamano("mediano");
       
       pe2.setNombre("many");
       pe2.setRaza("caniche");
       pe2.setEdad(4);
       pe2.setTamano("pequeño");
       
       p1.setNombre("ivan");
       p1.setApellido("gonzalez");
       p1.setEdad(35);
       p1.setPerro(pe1);
       
       p2.setNombre("juliana");
       p2.setApellido("gonzalez");
       p2.setEdad(2);
       p2.setPerro(pe2);
       
        System.out.println(p1.toString());
        System.out.println("");
        System.out.println(p2.toString());
              
            
       
       
    }
    
}
