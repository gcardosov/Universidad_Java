package domain;

public class Persona {

    private int idPersona;
    //Este atributo va incrementar cada vez que creemos un nuevo objeto
    private String nombre;
    private static int contadorPersonas;
    //variable que cuenta cuantos objetos personas se han creado 
    //esta asociado con la clase por la palabra static

    public Persona(String nombre) {
        this.nombre = nombre;
        //incrementar el contador por cada objeto nuevo
        //primero accedimos al atributo de la clase y lo incrementamos 
        //en , sin embargo nos marco error debido a que contadorPersona
        //es un atributo de la clase y this hace referencia al objeto
        //this.contadorPersonas++;        
        Persona.contadorPersonas++;
        //Asginamos el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;

    }

    //Metodos getters y setters
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;

    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
    

}
