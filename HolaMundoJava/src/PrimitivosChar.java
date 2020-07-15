

public class PrimitivosChar {
   

    public static void main(String args[]){
        //Almacena solo un caracter
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter); 
        //caracteres unicode 
        //para declarar los utilizamos /u y despues el numero que tiene 
        //asignado el caracter que quiero utilizar 
        //por ejemplo el caracter 0021 que es el signo de admiracion 
 
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        //sin embargo tambien podemos representarlo de otra forma 
        //tambien tiene un codigo decimal asociado
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        
        //////////
        
         
        var varChar1 = '\u0021';
        System.out.println("varChar = " + varChar);
        
        
        //En este caso no se hace la inferencia tenemos que hacer un casteo
        //var varCahrDecimal = (char)33;
        var varCharDecimal2 = 33;
        System.out.println("varCharDecima2 = " + varCharDecimal2);
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        //si declaramos como variabld e de tipo int al caracter !
        //nos dara como resultado su codigo deciamal 
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
    
        ////
        int letra = 'a';
        System.out.println("letra = " + letra);
        //97  seria lo que imprime con a
    
        ////
        int letra2 = 'A';
        System.out.println("letra2 = " + letra2);
        //65  seria lo que imprime con a
        
    }    
}
