
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
        //Persona persona1 = new Persona();
        Persona persona1  = null;
        //persona1.nombre = "Julieta";
        //System.out.println("persona1 nombre: " + persona1.nombre);  
        persona1 = cambiarValor(persona1);
        //System.out.println("persona1 cambio de nombre: " + persona1.nombre);
    }
    
    public static Persona cambiarValor(Persona persona){
        if(persona == null){
            System.out.println("Valor de persona invalido : null");
            return null;
        
        }
        //Si tenemos el void en el metodo
        //y vemos un return; es normal 
        //despues de la palabra return ya no podemos agregar nada
        persona.nombre = "Julieta";
        return persona;
    }
        
}
