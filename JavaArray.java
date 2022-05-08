public class JavaArray {
    public static void main(String[] args){
        //Los arrays son usados para almacenar multiples valores en una variable
        //Para declarar un array primero define la variable y luego agrega []

        //Se le puede agregar valores se puede usar un array literal, para esto debemos poner los valores separados por comas
        //dentor de llaves

        String[] dias = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};

        //Para acceder a los valores de un array debemos usar al numero indice del valor

        System.out.println(dias[0]);//Output: lunes

        //Para cambiar los valores de un array tambien se usa el numero indice

        dias[0] = "java";

        System.out.println(dias[0]);//Output: java

        //Se puede usar el metodo length para saber cuantos valores contiene un array

        System.out.println(dias.length);//Output: 7
    }
    
}
