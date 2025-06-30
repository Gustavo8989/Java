import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        var name = scanner.next();
        System.out.println("Digite a sua idade: ");
        var age = scanner.nextInt();

        if (age >= 18){
            System.out.printf("%s tem %s anos, %s pode dirigir \n",name,age,name);
        } else{
            System.out.printf("%s tem %s anos, $ não pode dirigir \n", name,age,name);
        }
        
    }
}
