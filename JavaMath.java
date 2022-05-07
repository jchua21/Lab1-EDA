public class JavaMath{
    public static void main(String[] args) {
        //La clase Java Math tiene muchos métodos que le permiten realizar tareas matemáticas con números.

        int a = 10;
        int b = 3;

        System.out.println("El maximo entre " + a + " y " + b + " es " + Math.max(a,b));
        System.out.println("El minimo entre " + a + " y " + b + " es " + Math.min(a,b));
        System.out.println("La raiz cuadrada de 625 es : " + Math.sqrt(625));
        System.out.println("EL valor absoluto de -312 es : " +  Math.abs(-312));
        System.out.println("Un número aleatorio entre 0 y 1 es " + Math.random());
    }
}