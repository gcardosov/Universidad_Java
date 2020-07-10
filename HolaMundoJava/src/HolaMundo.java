///////////////////////////////////////
//Comentario simple                 ///
//Mi clase en java                  ///
//Autor Gerardo Cardoso             ///
///////////////////////////////////////

public class HolaMundo {

    public static void main(String args[]) {
        //Concatenacion de cadenas
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); //Realiza la suma de numeros
        
        System.out.println(i + j + usuario);
        //empieza de izquierda a derecha por el concepto de contexto caena
        //por eso en esiguiente ejeplo imprime "Juan34"
        System.out.println(usuario + i + j);
        //Lo anterior se resuleve usando parentesis
        System.out.println(usuario + (i + j));
        
        
        
        
        
        
    }
}
