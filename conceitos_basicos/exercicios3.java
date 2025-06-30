import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa: ");
        var pessoa1 = scanner.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        var idade1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        var pessoa2 = scanner.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        var idade2 = scanner.nextInt();
        var diferenca = Math.abs(idade1 - idade2);
        System.out.printf("A diferença entre as idades é de %s",diferenca);

    }
}
