import java.util.Scanner;
public class JavaRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("====== FACTORIAL DE UN NÚMERO =======");
        System.out.print("Introdduce el número para calcular su factorial : ");
        int n  = scan.nextInt();
        n = factorial(n);
        System.out.println("El factorial es " + n);
    }

    public static int factorial(int num) {
            if(num > 0){
                int valor = num * factorial(num - 1);
                return valor;
            }
            return 1;
    }
}
