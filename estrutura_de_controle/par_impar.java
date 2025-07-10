import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite o valor1: ");
        var valor1 = scanner.nextInt();
        System.out.println("Digite o valor2: (O valor2 tem que ser maior que o primeiro)");
        var valor2 = scanner.nextInt();
        while(valor1 > valor2){
            System.out.println("O valor1 e maior que o valor2, o cÃƒÂ³digo ira se repetir 10 vezes");
            valor2 = scanner.nextInt();
        }
        System.out.println("VocÃª quer um numero par ou impar");
        int maior = valor1 < valor2 ? valor1 : valor2;
        int menor = valor1 > valor2 ? valor1 : valor2;
        var escolha = scanner.next();
        if(escolha.equalsIgnoreCase("Par")){
            for(int i = menor; i<= maior;i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
        if(escolha.equalsIgnoreCase("impar")){
            for(int i = menor; i<= maior;i++){
                if(i % 2 != 0){
                    System.out.println(i);
            }
        }
        }
        
    }

}
