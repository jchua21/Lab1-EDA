public class JavaTypeCasting {
    public static void main(String[] args){
        //Type casting es asignar una variable de valor primitivo a otro tipo de variable

        //Hay 2 tipos de Type casting, el ensanchamiento y el estrechamiento

        //El ensanchamiento es hecho automaticamente al asignar una variable pequeña a una mas grande

        int numero = 9;
        double ensanchamiento = numero;

        System.out.println(ensanchamiento);//Output: 9.0

        //El estrechamiento debe ser hecho manualmente poniendo entre parentesis el tipo de variable

        double original = 3.14;
        int estrechamiento = (int)original; 

        System.out.println(estrechamiento);//Output: 3

    }
}
