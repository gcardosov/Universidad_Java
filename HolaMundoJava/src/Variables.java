
public class Variables {
    public static void main (String args[]){
        //Reglas
            //Tipo
            //Identificador
            //Inicializacion
            //Notacion de camello
            
            //Definimos la variable 
            int miVariableEntera = 10;
            System.out.println(miVariableEntera);
            //Modificamos el valor de la variable 
            miVariableEntera = 5;
            System.out.println(miVariableEntera);
               //Variable tipo String 
            String miVariableCadena = "Saludos";
            System.out.println(miVariableCadena);
            miVariableCadena = "Adios";
            System.out.println(miVariableCadena);
            
            //Inferencia de tipos en Java 
            //Introducido a partir de la version 
            //10 del JDK
            // var - inferencia 
            var miVariableEntera2 = 15;
            System.out.println(miVariableEntera2);
            
            var miVariableCadena2 = "Inferencia";
            System.out.println(miVariableCadena2);
    }
}
