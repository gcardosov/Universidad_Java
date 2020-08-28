
package test;
import dominio.Persona;

public class PersonaPrueba {    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Gerardo", 11000.00, false);
            //System.out.println("persona1 nombre: " + persona1.getNombre());
            System.out.println("persona1: " + persona1.toString());
            //anteriormente cambiavamos los valores directamente
            //persona1.nombre = "Leonardo"
            //pero como usamos el modificador de acceso a private  
            //por eso usamos set
            persona1.setNombre("Leonardo");
            //lo mismo pasa para imprimir  
            //System.out.println("nombre: " + persona1.nombre);
            //por eso usamos get
            //System.out.println("persona1 nombre con cambio: " + persona1.getNombre());
            //System.out.println("persona sueldo: " + persona1.getSueldo());
            //System.out.println("persona eliminado: " + persona1.isEliminado());
            
            
            //Persona persona2 = new Persona("Julieta", 15000.00, true);
            //System.out.println("persona2 nombre: " + persona2.getNombre());
            //persona2.setNombre("Blanca");
            /* 
            System.out.println("persona2 nombre con cambio:" + persona2.getNombre());
            System.out.println("persona sueldo: " + persona2.getSueldo());
            System.out.println("persona eliminada" + persona2.isEliminado());
            */
            System.out.println("persona1: " +persona1.toString());
            
            //SI EL METODO toString esta implementado en la clase persona
            //al hacer un print se ejecutara en automatico
            
    }
    
    
}
