
package AtsMetodoConstructor;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    
    //Metodos 
    
    //Metodos constructor
    public Persona(String _nombre, int _edad){
        this.nombre = _nombre;
        this.edad = _edad;
        //this accede al atriubto de la clase 
        //cuando inicializamos el constructor con parametros
        
    }
    
    
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre );
        System.out.println("La edad es: " + edad);                
    }        
    
}
