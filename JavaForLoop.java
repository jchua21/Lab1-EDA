public class JavaForLoop {
    public static void main(String[] args){
        //Puedes usar el bucle For si sabes cuantas veces quieres repetir tu codigo

        //En el bucle for hay 3 statements
        //El primero se ejecuta antes de entrar al bucle, el segundo es la condicion para seguir repitiendo el bucle
        //El tercero  es ejecutado cada vez que el bloque de codigo haya sido ejecutado

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //En este ejemplo se inicia primero la variable i con el valor 0, la condicion para seguir el loop es que i sea menor a
        //5, y luego de cada ejecucion se aumenta el valor de i en 1

        /*Output:
        0  
        1
        2   
        3
        4
        */
    }
}
