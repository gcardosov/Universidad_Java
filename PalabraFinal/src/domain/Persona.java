
package domain;

public class Persona {
    //una variable marcada como final se combina con static 
    //para mandarla a llamar con el nombre de la clase
    //se vuleve una constante 
    //podemos invertir el orden de los modificadores
    public final static int MI_CONSTANTE = 1;
    
    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
            
    public void imprimir(){
        System.out.println("Metodo imprimir");
    }
    
}
