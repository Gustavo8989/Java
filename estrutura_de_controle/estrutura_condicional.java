import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        var name = scanner.next();
        System.out.println("Digite a sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n) ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18){
            System.out.printf("%s tem %s anos, %s pode dirigir \n",name,age,name);
        } else if (age >= 16 && isEmancipated){
            System.out.printf("%s, apesar de você ter %s, você consegue dirigir por ser emancipado \n",name,age)

        }else{
            System.out.printf("%s tem %s anos, $ não pode dirigir \n", name,age,name);
        }
        
    }
}
