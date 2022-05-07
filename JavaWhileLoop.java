import java.util.Scanner;
public class JavaWhileLoop{
    public static void main(String[] args) {
        //Funcionalidad Ciclo While
        Scanner scan = new Scanner(System.in);
        int inicio;
        int fin;

        System.out.println("==== VER NÚMEROS =====");
        System.out.print("Por favor ingrese el valor inicial : ");
        inicio = scan.nextInt();

        System.out.print("Por favor ahora ingrese el valor final : ");
        fin = scan.nextInt();

        System.out.println("Los números mostrados son : ");
        while(inicio <= fin){
            System.out.println(inicio);
            inicio++;
        }
    }
}