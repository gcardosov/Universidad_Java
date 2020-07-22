
public class ProcedenciaDeOperadores {
   
    public static void main(String args[]){
        //orden en el que se evaluan los operadores
        //Los unarios son los mas importantes
        //parentesis tambien ocupan un lugar importante 
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        
        //Cuanto vale z?
        //primero van los unarios
        //despues los binarios 
        // X = 6
        // y = 10
        //que valor tiene la variable al momento que la ocupemos
        //16
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);        
        
        var resultado = 4 + 5 * 6 / 3;
        //30 (5*6)
        //10 (30 / 3)
        //14 (10 + 4)        
                 
        System.out.println("resultado = " + resultado);
        
        var resultado2 = (4 + 5) * 6 / 3;
        // (9) * 6
        // 54 / 3
        // 18
        
        System.out.println("resultado2 = " + resultado2);
        
        
        
    }           
}
 