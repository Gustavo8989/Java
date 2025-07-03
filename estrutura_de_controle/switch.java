import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 4");
        var option = sacanner.nextInt();
        switch(option){
            /*case 1:
                System.out.println("Você escolheu 1");
                break;
            case 2:
                System.out.println("Você escolheu 2");
                break;
            case 3:
                System.out.println("Você escolheu 3");
                break;
            case 4:
                System.out.println("Você escolheu 4");
                break;
            default:
                System.out.println("Opção invalida");

        }*/
        switch(option){
            case 1 -> System.out.println("Você escolheu o valor 1");
            case 2 -> System.out.println("Você escolheu o valor 2");
            case 3 -> System.out.println("Você escolheu o valor 3");
            case 4 -> System.out.println("Você escolheu o valor 4");
            default -> System.out.println("Opção invalida")
        }
    }
}
