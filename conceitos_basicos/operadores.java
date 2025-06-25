import java.util.Scanner;

/*
public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2?");
        var result = scanner.nextInt();
        var isRight = result == 4; 
        var isRight2 = result != 4;
        System.out.printf("O resultado é 4, você acertou? (%s)",isRight);
        System.out.printf("O resultado é 4, você acertou? (%s)",!isRight2); 
        }

}
 
*/
class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto anos você tem? ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18;
        System.out.printf("Você pode dirigir? (%s)",!canDrive);
        
    }
}

