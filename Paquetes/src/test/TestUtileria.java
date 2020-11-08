
package test;
//import mx.com.gcardosov.*;
//import mx.com.gcardosov.Utileria;

//import static es decir importamos solo el metodo 
//statico Y YA NO INDICAMOS LA CLASE AL INVOCAR EL 
//METODO
import static mx.com.gcardosov.Utileria.imprimir;


public class TestUtileria {
    public static void main(String[] args) {
        //Utileria.Imprimir("Saludos!");
        imprimir("Adios!");
        //Nombre completamente calificado es decir todo
        //paquete, clase y metodo
        mx.com.gcardosov.Utileria.imprimir("Adios otra vez!");
    }
}
