package Operadores;


public class OperadoresIgualdadRelacionales {
    public static void main(String args[]){
        
        var a = 3;
        var b = 2;
        
        //Igual a == Si 2 elementos son iguales y regresa un true o un false
        //Con objetos tiene un uso diferente en objetos y cadenas 
        var c = (a == b);
        System.out.println("c = " + c);
        
        //cadenas
        //verifica el contenido de las cadenas? NO
        String cadena1 = "Hola";
        String cadena2 = "Hola";
        var e = cadena1 == cadena2; //compara la referencia y no el contenido  
        System.out.println("e = " + e);
        
        //Para verificar el contenido de las cadenas usamos el metodo equals()
        //Comparar contenido en el tipo de dato String
        var f = cadena1.equals(cadena2); //comparamos contenido de cadenas
        System.out.println("f = " + f);
        
        //diferente de !=
        //se puede usar parentesis para mejorar la legibilidad 
        //"Si a es diferente de b"
        var d = (a != b);
        System.out.println("d = " + d);
        
        //OPERADORES RELACIONALES
        
        var g = a >= b; //Mayor , mayor o igual 
        System.out.println("g = " + g);
        
        if(a % 2 == 0){
            System.out.println("Es numero par");
        }else{
            System.out.println("NO es numero par");
        }
        
        var edad = 15;
        var adulto = 18;
        
        if(edad >= adulto){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("NO eres mayor de edad");
        }
        
        
          
        
    }
    
}
