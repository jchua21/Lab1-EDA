public class JavaScope {
    public static void main(String[] args){
        //Scope significa alcance, las variables en java solo pueden ser accesibles luego de ser declaradas en el mismo metodo 
        //donde estas fueron declaradas o en el mismo bloque de codigo

        //x no puede ser accedido aqui
        int x = 17;
        //x puede ser accedida aqui



        //y no puede ser accedido aqui
        {
            //y no puede ser accedido aqui
            String y = "Mi variable";
            //y puede ser accedio aqui
        }
        //y no puede ser accedido aqui
    }
}
