import java.util.Scanner;
public class Java_If_Else{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Java admite las condiciones lógicas habituales de las matemáticas:
        //Utilice la if declaración para especificar un bloque de código Java que se ejecutará si una condición es true.
        
        System.out.println("===== SIMULADOR DE SEGURIDAD =======");
        System.out.print("Ingrese su Edad : ");
        int num = scan.nextInt();

        if(num < 18  ||  num > 80){
            System.out.println("Lo sentimos, no tiene permitido ingresar al Local");
        }else{
            System.out.println("¡¡Disfrute esta nueva experiencia en nuestro Local!!");
            //Genero un num que inddicará el número de asiento del cliente
            int asiento = (int)(Math.random()*(10-1+1)) + 1;
            
            if(asiento % 2 == 0){
                System.out.println("Diríjase a la Derecha");
            }else{
                System.out.println("Dirijase a la Izquierda");
            }
        }
    }
}

