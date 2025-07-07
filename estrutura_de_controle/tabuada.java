import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero para ver a tabuada: ");
        var num = scanner.nextInt();
        for (var i = 1; i <= 10;i++){
            var tabuada = num * i;
            System.out.printf("%s X %s = %s \n",i,num,tabuada);

        }
    }
}
