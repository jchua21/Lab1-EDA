import java.util.Scanner;
public class JavaMethods {
    public static void main(String[] args) {
        //Puedo reutilizar código por medio de las funciones
        System.out.println("USUARIO 1");
        ingresarDatos();
        
        System.out.println("USUARIO 2");
        ingresarDatos();

        System.out.println("USUARIO 3");
        ingresarDatos();
    }

    public static void ingresarDatos(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su Nombre : ");
        String nombre = scan.nextLine();

        System.out.print("Ingrese su Apellido : ");
        String apellido = scan.nextLine();

        System.out.println("Bienvenido : " + nombre + " " + apellido);
    }
}
