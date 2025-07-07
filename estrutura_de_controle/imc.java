import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        var peso = scanner.nextFloat();
        System.out.println("Digite a sua altura: ");
        var altura = scanner.nextFloat();
        var imc = peso/(altura*altura);
        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
            System.out.printf("Seu imc é de: %s \n",imc);
        }else if(imc > 18.5 && imc <= 24.9){
            System.out.println("Peso ideal");
            System.out.printf("Seu imc é de: %s \n",imc);
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
            System.out.printf("Seu imc é de: %s \n",imc);
        }else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade Grau I");
            System.out.printf("Seu imc é de: %s \n",imc);
        }else if(imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade Grau II");
            System.out.printf("Seu imc é de: %s \n",imc);
        }else if(imc > 40){
            System.out.println("Obesidade mórbida");
            System.out.printf("Seu imc é de: %s \n",imc);
        }
    }
}
