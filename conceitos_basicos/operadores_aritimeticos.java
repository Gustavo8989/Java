import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("informe o valor 1: ");
        var valor1 = scanner.nextFloat();
        System.out.println("Informe o valor 2: ");
        var valor2 = scanner.nextFloat();
        var value = 5 + 9 * 10 - 5 / 2;
        var value_mais = 5;
        value_mais += 12;
        System.out.printf("%s + %s = %s \n",valor1,valor2,valor1 + valor2);
        System.out.printf("%s - %s = %s \n",valor1,valor2,valor1 - valor2);
        System.out.printf("%s * %s = %s \n",valor1,valor2,valor1 * valor2);
        System.out.printf("%s / %s = %s \n",valor1,valor2,valor1 / valor2);
        System.out.printf("%s %% %s = %s \n",valor1,valor2,valor1 % valor2);
        System.out.printf("A raiz quadrada do %s é de %s\n",valor1,Math.sqrt(valor1));
        System.out.printf("A Potencia  do %s é de %s\n",valor1,Math.pow(valor1,2));
        System.out.println(value);
        System.out.println(value_mais);
        

    }
}
