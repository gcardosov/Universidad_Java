
package dominio;


public class Persona {
    //Vamos a empezar a manipular los modificadores de 
    //acceso de los atributos para ver el concepto de 
    //encapsulamient empzamos con private
    
    //ATRIBUTOS
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    
    //CONTRUCTOR CON PARAMETROS
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
                
    }
    
    //METODOS GETTERS Y SETTERS
    //GET recupera información
    //SET modifica información
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    //Para los tipos boolean se ocupa "is"    
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
    //El metodo toString
    //Convierte en cadena cada uno de los atributos que contiene la clase 
    public String toString(){
        return "Persona [nombre: "+ this.nombre + 
                " , sueldo: " + this.sueldo +
                " , eliminado: " + this.eliminado +"]";
    }
    
    
    
}
