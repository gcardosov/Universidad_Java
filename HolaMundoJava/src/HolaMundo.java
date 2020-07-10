///////////////////////////////////////
//Comentario simple                 ///
//Mi clase en java                  ///
//Autor Gerardo Cardoso             ///
///////////////////////////////////////

public class HolaMundo {

    public static void main(String args[]) {
        //Caracteres especiales en Java
        //salto de linea \n
        //tabulador \t
        //retroceso \b
        //Comilla simple y comilla doble
        //hay casos especificos para la comilla simple
        //para la comilla doble se utiliza la \ para indicar
        //que es comilla doble como en el ejemplo 
        //debemos tener en cuenta donde se rompe la cadena 
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        //Se retrocede un caracter por cada \b que exista
        //1
        System.out.println("Retroceso: \b" + nombre);
        //2
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        
        
    }
}
