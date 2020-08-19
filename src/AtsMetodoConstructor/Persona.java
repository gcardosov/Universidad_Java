
package AtsMetodoConstructor;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    
    //Metodos 
        public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        }
        
    //Sobrecargamos el constructor indicando solo un atributo
    //Siempre y cuando los parametros sean diferentes 
        public Persona(String dni) {
        this.dni = dni;
        }
        
        
        public void correr(){
            System.out.println("Soy" + nombre + ", tengo" + edad + " años y estoy corriendo una maraton");
        }
        
        
        public void correr(int km){        
            System.out.println("He corrido " + km + "kilometros");
        }
    
    
    
    //Metodos constructor
//    public Persona(String _nombre, int _edad){
//        this.nombre = _nombre;
//        this.edad = _edad;
//        //this accede al atriubto de la clase 
        //cuando inicializamos el constructor con parametros
        
//    }
//    
//    
//    public void mostrarDatos(){
//        System.out.println("El nombre es: " + nombre );
//        System.out.println("La edad es: " + edad);                
//    }        
//    




    
}
