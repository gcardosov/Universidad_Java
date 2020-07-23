
public class Switch {

    public static void main(String args[]) {
        //Las comprobaciones son de tipo numerico
        //y tipo string a diferencia del else-if
        var numero = 3;
        var numeroTexto = "Desconocido";

        //switch recibe como argumento una variable para su evaluacion
        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break; //rompe la comprobacion de cada uno de los casos 
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
                //un caso como el else es el default
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
