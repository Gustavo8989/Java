/*Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), 
Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; 
Ra = C * 1.8 + 32 + 459.67*/

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    var scanner = new Scanner(System.in);
	    System.out.println("Digite a temperatura em celsius: ");
	    var celsius = scanner.nextInt();
	    System.out.println("Você quer trasformar em que? ");
	    System.out.println("Fahrenheit(F)\nKelvin(K)\nRéaumur(Re)\nRankine(Ra)\nFahrenheit(F)\n");
	    var result = scanner.next();
	    if(result.equalsIgnoreCase("F")){
	        var fahrenheit = celsius * 1.8 + 32;
	        System.out.printf("A temperatura em celsius:(%s)\nEm Fahrenheit:(%s) \n",celsius,fahrenheit);
	    }else if(result.equalsIgnoreCase("K")){
	        var kelvin  = celsius + 273.15;
	        System.out.printf("A temperatura em celsius:(%s)\nEm kelvin:(%s) \n",celsius,kelvin);
	    }else if(result.equalsIgnoreCase("Re")){
	        var reaumur = celsius * 0.8;
	        System.out.printf("A temperatura em celsius:(%s)\nEm Réaumur:(%s) \n",celsius,reaumur);
	    }else if(result.equalsIgnoreCase("Ra")){
	        var rankine = celsius * 1.8 + 32 + 459.67;
	        System.out.printf("A temperatura em celsius:(%s)\nEm Rankine:(%s) \n",celsius,rankine);
	    }
	}
}

