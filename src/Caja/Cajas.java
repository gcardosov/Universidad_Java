
package Caja;

//Creacion de clase con 3 atributos
public class Cajas {              
    
    int anchura;
    int altura;
    int profundo;
    
//Metodo constructor vacio    
    public Cajas(){
    
    }
    
//Metodo con parametros    
    public Cajas(int ancho, int alto, int profundidad){
        this.anchura = ancho;
        this.altura = alto;
        this.profundo = profundidad;            
    }
                    
//Metodo para calcular el volumen
    public int calcularVolumen(){
        return anchura*altura*profundo;        
    }
    
    
}
