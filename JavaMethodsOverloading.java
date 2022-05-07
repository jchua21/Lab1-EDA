public class JavaMethodsOverloading {
    public static void main(String[] args) {
        System.out.println("Overlading de Metodos");
        System.out.println("El resultado es : " + multiplicar(5, 10));
        System.out.println("El resultado es : "  + multiplicar(3.2, 1.5));
        multiplicar(10);
    }

    public static int multiplicar(int a, int b) {
        return a*b;
    }

    public static double multiplicar(double a, double b){
        return a*b;
    }

    public static void multiplicar(double a){
        System.out.println("El resultado es : " +  (a*a));
    }
}
