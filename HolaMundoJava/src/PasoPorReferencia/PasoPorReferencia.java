
package PasoPorReferencia;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        //Cuando trabajamos con objetos
        //se almacenan las referencias 
        //de memoria 
        //Aqui como si se altera el valor guardado en memoria
        //mas no se manda un copia
        //si podemos alterar el valor desde otro metodo
        Persona persona1 = new Persona();
        persona1.nombre = "Julieta";
        System.out.println("persona1 nombre: " + persona1.nombre);  
        cambiarValor(persona1);
        System.out.println("persona1 cambio de nombre = " + persona1.nombre);
    }
    
    public static void cambiarValor(Persona persona){
        persona.nombre = "Martin";
        
    }
    
    
}
