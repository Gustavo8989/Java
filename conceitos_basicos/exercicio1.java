import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        var nome = scanner.nextLine();
        System.out.println("Digite o ano do seu nacimento: ");
        var ano = scanner.nextInt();
        var idade = 2025 - ano;
        System.out.printf("O %s naceu no ano de %s isso quer dizer que a idade dele %s \n",nome,ano,idade);

    }
}
