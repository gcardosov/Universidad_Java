
package Clases;


public class PruebaPersona {
    public static void main(String[] args) {
        //Declaracion de la variable        
        //Creacion de un objeto
        //usamos new 
        //el objeto puede acceder a los atributos y metodos
        Persona persona1 = new Persona(); //Metodo constructor Persona();
                                  //Permite asigna valores al objeto
                                  //Reserva memoria  
        //Accediendo a los atributos de la clase
        //con el operador punto 
        //Asignamos valores a los atributos que hereda 
        // el objeto juan de la clase Persona
        persona1.nombre = "Juan";  
        persona1.apellido = "Perez";
        persona1.desplagarInformacio();
        
        //Segundo objeto
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        
        persona2.desplagarInformacio();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplagarInformacio();                                                  
    }    
}
