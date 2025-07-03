import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        /*
        for (;;){
            System.out.println("Digite o seu nome");
            var name = scanner.next(); 
            if (name.equalsIgnoreCase("exit")) break;
            System.out.println(name);

        }*/
        for (var i = 1; i < 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
