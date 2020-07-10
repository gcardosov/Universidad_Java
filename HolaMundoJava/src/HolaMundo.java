
import java.util.Scanner;

///////////////////////////////////////
//Comentario simple                 ///
//Mi clase en java                  ///
//Autor Gerardo Cardoso             ///
///////////////////////////////////////

public class HolaMundo {

    public static void main(String args[]) {
        //Uso de la clase Scanner
        System.out.println("Escribe tu nombre:");
        //Clase Scanner para introducir
        //Instancemaos una clase de la clase escaner llamada
        //consola que va a recibir entradas a traves de consola
        Scanner consola = new Scanner(System.in);
        //El metodo nextLine nos permite leer toda una linea en consola
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        var titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario);
    }
}
