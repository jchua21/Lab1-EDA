public class JavaSwitch {
    public static void main(String[] main){
        //Usa el switch para correr un bloque de codigo dependiendo de la variable
        //Funciona de la siguiente forma, primero toma el valor dado en el switch, luego lo compara con cada valor en los case
        //si algun case tiene el mismo valor, ejecuta el bloque de codigo que contiene ese case

        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
        //Output: Sabado

        //La palabra clave break, cuando Java encuentra un break detiene la ejecucion del bloque de codigo
        //La palabra clave default, esta palabra clave hace que se ejecute su bloque de codigo si no hay ningun case es identico
        //Break y defauit es opcional
    }
}
