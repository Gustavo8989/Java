import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadadro para calcula-lo: ");
        var tamanho_lado = scanner.nextFloat();
        var area = tamanho_lado * tamanho_lado; 
        System.out.printf("A área do quadadro é igual a %s",area);

    }
}
