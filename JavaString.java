public class JavaString {
    public static void main(String[] args){
        //Los strings son usados para almacenar texto, esta clase tiene muchos metodos

        String miString = "Hola Mundo";

        //METODOS

        //length: 
        //Length es usado para saber la cantidad de caracteres que tiene un string

        System.out.println(miString.length()); //Output: 10

        //toUpperCase:
        //Este metodo nos retorna el string pero con todas las letras en mayuscula
        System.out.println(miString.toUpperCase()); //Output: HOLA MUNDO

        //toLowerCase:
        //Este metodo nos retorna el string pero con todas las letras en minuscula
        System.out.println(miString.toLowerCase()); //Output: hola mundo

        //indexOf:
        //Devuelve la posicion de la primera coincidencia con el texto especificado en el string
        System.out.println(miString.indexOf("Mundo")); //Output: 5
    }
    
}
