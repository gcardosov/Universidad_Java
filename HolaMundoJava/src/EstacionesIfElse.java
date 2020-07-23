
import java.util.Scanner;

public class EstacionesIfElse {

    public static void main(String args[]) {

        System.out.println("Programa para calcular estaciones del anio");
        System.out.println("Ingresa un mes del 1 al 12");
        Scanner consola = new Scanner(System.in);
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";

        if (mes == 12 || mes == 1 || mes == 2) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);
    }

}
