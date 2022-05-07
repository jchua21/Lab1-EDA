import java.util.Scanner;
public class Java_Break_Continue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Se mostrarán los resultados que no son múltiplos del número ingresado");

        System.out.print("Ingrese el valor inicial : ");
        int a = scan.nextInt();

        System.out.print("Ingrese el valor final : ");
        int b = scan.nextInt();

        System.out.println("Ingrese el número del que no quiere que mostremos sus múltiplos");
        int num = scan.nextInt();

        System.out.println("Los Numeros son : ");
        for (int i = a; i <= b; i++) {
            //Si i es la mitad de la suma de los dos ingresados se rompe el bucle
            if(i == (a+b)/2){
                System.out.println("Algo ha ocurrido, el bucle se rompio!!!");
                break;
            }
            //Si es multiplo lo obvia y pasa a la siguiente iteración
            if(i % num == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
