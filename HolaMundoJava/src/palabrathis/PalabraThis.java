
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.apellido);
        
    }    
}

class Persona{
    String nombre;
    String apellido;
        
    Persona(String nombre, String apellido){
        //super(); llamada al constructor de la clase padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        //Como podemos mandar a imprimir el objeto 
        //persona dentro de la misma clase
        System.out.println("Objeto persona usando this " + this );
        //tambien se pueden crear objeto con la siguiente sintexis 
        new Imprimir().imprimir(this);       
        
    }
}

    class Imprimir{
                
        public void imprimir(Persona persona){
            System.out.println("persona desde imprimir: " + persona);
            System.out.println("impresion del objeto actual(this) " + this);
    
        }    
    }
    
