public class JavaMethodParameters {
    //Informacion puede ser pasada a los metodos usando parametros, estos actuan como variables dentro del metodo
    //Los parametros son especificados despues del nombre del metodo dentro del parentesis.

    //No hay limite a cuantos parametros puede tener un metodo
    public static void porSeis(int num){
        System.out.println(num*6);
    }

    //La palabra clave void le indica a java que la funcion no retornara ningun valor, pero si quieres que retorne un valor
    //debemos especificar que tipo de valor retornara y usar la palabra clave return para retornar un valor
    public static int porSeisRetorno(int num){
        return num*6;
    }

    //Es normal usar if else dentro de metodos
    public static boolean mayorDeEdad(int edad){
        if(edad>=18){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args){
        porSeis(2);//Output: 12
        
        System.out.println(porSeisRetorno(-9));//Output: -54

        System.out.println(mayorDeEdad(17));//Output: false
    }
}
