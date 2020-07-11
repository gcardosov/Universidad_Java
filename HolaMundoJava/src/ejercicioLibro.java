
import java.util.Scanner;

public class ejercicioLibro {

    public static void main(String args[]) {

        System.out.println("Proporciona el titulo: ");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();

        System.out.println("Proporciona el autor: ");
        consola = new Scanner(System.in);
        var autor = consola.nextLine();
        System.out.println(titulo + " " + "fue escrito por" + " " + autor);

    }
}
