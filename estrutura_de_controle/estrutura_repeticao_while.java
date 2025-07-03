import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var name = "";
        var scanner = new Scanner(System.in);
        /*while(!name.equals("exit")){
            System.out.println("Informe seu nome: ");
            name = scanner.next();
            System.out.println(name);
        }
        while(true){
            System.out.println("Informe seu nome: ");
            name = scanner.next();
            System.out.println(name);
            if(name.equalsIgnoreCase("exit")) break;
        }
        System.out.println("Fim do programa");*/
        do{
            System.out.println("Informe seu nome: ");
            name = scanner.next();
            System.out.println(name);
            
        }while(!name.equalsIgnoreCase("exit"));
    }
}
