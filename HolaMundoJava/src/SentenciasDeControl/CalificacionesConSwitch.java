package SentenciasDeControl;


import java.util.Scanner;


public class CalificacionesConSwitch {
    
    public static void main(String args[]){
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10: ");
        int calificacion = (int) Float.parseFloat(consola.nextLine());
        var desconocido = "Valor desconocido";
        
             /*OTRA FORMA DE HACERLO PARA TOMAR LOS RANGOS DE VALORES
             //MAXIMOS Y MINIMOS
             if (calificacion >= 9 && calificacion <= 10)
            System.out.println("A");
        //Si esta entre  8 y menor a 9 imprimir: B
        else if(calificacion >= 8 && calificacion < 9)
            System.out.println("B");
        //Si esta entre 7 y menor a 8 imprimir: C
        else if(calificacion >= 7 && calificacion < 8)
            System.out.println("C");
        //Si esta entre 6 y menor a 7 imprimir: D
        else if(calificacion >= 6 && calificacion < 7)
            System.out.println("D");
        //Si esta entre 0 y menor a 6 imprimir: F
        else if(calificacion >= 0 && calificacion < 6)
            System.out.println("F");
        //Si no esta en el rago, imprimir: Valor desconocido
        else
             
             */
             
        
        switch(calificacion){
            
            case 10: case 9:
                desconocido = "A";
             break;
             
            case 8: 
                desconocido = "B";
             break;
             
             case 7:
                desconocido = "C";
             break;
                          
             case 6:
                desconocido = "D";
             break;
             
             case 5: case 4: case 3: case 2: case 1: case 0:
                desconocido = "F";
             break;    
             
   
             
             
        }        
        System.out.println(desconocido);
    }    
}
