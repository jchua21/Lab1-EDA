public class JavaDataTypes{
    public static void main(String[] args) {
        /* Tipos de datos primitivos: incluye byte, short, int, long, float, doubleybooleanchar
        Tipos de datos no primitivos, como StringArrays y Classes */

        System.out.println("=========== Tipos de Datos =========");

        byte dato1 = 50;
        System.out.println("Byte : " + dato1);

        short dato2 = 130;
        System.out.println("Short : " + dato2);

        int dato3 = 200000;
        System.out.println("Int : " + dato3);

        long dato4 = 1000000000L;
        System.out.println("Long : " + dato4);

        float dato5 = 4.30f;
        System.out.println("Float : "  + dato5);
        
        double dato6 = 23.4d;
        System.out.println("Double : " + dato6);

        boolean esVerdadero = true;
        boolean esFalso = false;
        System.out.println("Boolean : " + esVerdadero); 
        System.out.println("Boolean : " + esFalso); 

        char caracter = 'J';
        System.out.println("Este es un caracter : " + caracter);

        String cadena = "Esto es una cadena";
        System.out.println(cadena);

        System.out.println("Los datos no primitivos se tratarán más adelante");
    }

}