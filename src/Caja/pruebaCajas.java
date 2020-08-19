
package Caja;

public class pruebaCajas {
    
    public static void main(String[] args) {       
        int ancho = 3;
        int alto = 2;
        int profundidad = 6;
        
    Cajas caja1 = new Cajas();    
    //OJO!!! con la asinacion recuerda que los objetos acceden a los
    //atributos y metodos de la clase
       caja1.anchura = ancho;
       caja1.altura = alto;
       caja1.profundo = profundidad;      
       System.out.println("El volumen de la caja1 es: " + caja1.calcularVolumen());            
        
    }
    
}
