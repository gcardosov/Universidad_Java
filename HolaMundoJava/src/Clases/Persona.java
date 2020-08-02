/*
 Clase Persona
----Atributos
-nombre : String
-genero : char
-ocupacion : String

----Operaciones
+obtenerNombre() : String
+obtenerGenero() : String
+obtenerOcupancion() : String 
+modificarNombre(nombre : String)
+modificarGenero(genero : char)
+modificarOcupacion(ocupacion : String)



 */
package Clases;
//Definiremos la clase Persona

public class Persona {
    //Atributos de la clase
    String nombre;
    String apellido; 
    
    //Metodos de la clase
    //Pueden recivir o no arguementos 
    //Pueden o no regresar algún valor
    //Se pueden mandar a llamar cuantas veces sea necesario
    //Se puede verificar el contenido de una clase
    //con la herramienta "Navigator" es Ctrl + 7
    public void desplagarInformacio(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    
    }           
}
