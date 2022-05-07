public class JavaTypeCasting {
    public static void main(String[] args){
        //Type casting es asignar una variable de valor primitivo a otro tipo de variable

        //Hay 2 tipos de Type casting, el ensanchamiento y el estrechamiento

        //El ensanchamiento es hecho automaticamente al asignar una variable pequeña a una mas grande

        int numero = 9;
        double ensanchamiento = numero;

        //El estrechamiento debe ser hecho manualmente poniendo entre parentesis el tipo de variable

        double original = 9.59;
        int numeroNumero = (int)original; 

    }
}
