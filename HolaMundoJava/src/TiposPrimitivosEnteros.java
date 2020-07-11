
public class TiposPrimitivosEnteros {

    public static void main(String args[]) {
        /* 
       tipos primitivos enteros:
        byte    
        short 
        int
        long                
         */

        byte numeroByte = (byte) 129;
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);
        /*
        8bits
        impresioon de tipos cuando sobrepasamos la capacidad 
        de amlamcenamiento del tipo de dato
        ejemplo:
            byte numeroByte = (byte)129;
        System.out.println("Valor byte:" + numeroByte);
        Valor byte:-127 vemos que no llega al 129 es la impresicion de tipos
        Valor minimo del byte: -128
        Valor maximo del byte: 127        
         */

        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);
        
        //32 bits
        int numeroInt =(int)214748368L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo de Int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de Int: " + Integer.MAX_VALUE);
        
        //64 bits
        long numeroLong = 9223372036854775807L;
        System.out.println("Valor minimo de Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de Long: " + Long.MAX_VALUE);
        
        
    }
}
