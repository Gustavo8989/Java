import java.util.Scanner;

public class Main{
    public static void string(String[] args){
        var scanner = new Scanner(System.in);
        System.out.prinln("Digite um numero: ");
        var valor1 = scanner.nextInt();
        while (true){
            while (valor1 < n){
                System.out.prinln("Digite um numero");
                var n = scanner.nextInt();
                if(n % valor1 != 0){
                    break
                }
            }
        }
    }
}
