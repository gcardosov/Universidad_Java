
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //Ya no se le puede reasignar algun valor a las variables final
        //miVariable = 5;
        
        //Persona.MI_CONSTANTE = 5;
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
        
    }
        
}
