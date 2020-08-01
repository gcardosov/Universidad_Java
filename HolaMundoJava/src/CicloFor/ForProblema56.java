package CicloFor;

import java.util.Scanner;
//Obtener la suma de los primeros N numeros naturales positivos

public class ForProblema56 {

    public static void main(String args[]) {

        //VARIABLES
        /*
            i -> Contador
            n -> numero de entrada 
            s -> suma         
         */
        int n, s = 0;

        //ENTRADA        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero: ");
        n = teclado.nextInt();
        

        //PROCESO
        for (int i = 1; i <= n; i++){
            s = s + i;
            /*System.out.println("i: " + i);
            System.out.println("n: " + n);
            System.out.println("s: " + s);
            */
        }
        
        //SALIDA 
        System.out.println("");
        System.out.println("Suma: " + s);
    }
}
