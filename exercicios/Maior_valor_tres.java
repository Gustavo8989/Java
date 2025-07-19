import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro numero: ");
		var n1 = scanner.nextInt();
		System.out.println("Digite o valor do Segundo numero: ");
		var n2 = scanner.nextInt();
		System.out.println("Digite o valor do Terceiro numero: ");
		var n3 = scanner.nextInt();
		if(n1 > n2 && n1 > n3){
		    System.out.printf("O %s é o maior valor \n",n1);
		}if(n2 > n1 && n2 > n3){
		    System.out.printf("O %s é o maior valor \n",n2);
		}if(n3 > n2 && n3 > n1){
		    System.out.printf("O %s é o maior valor \n",n3);
		}if(n1 == n2 && n1 == n3){
		    System.out.println("Os valores são iguais:");
		}
	}
}

