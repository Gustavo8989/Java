/*
Crie um programa em Java que:
   
    Peça o nome do aluno.

    Peça quantas matérias ele quer cadastrar (ex: 3).

    Para cada matéria, peça o nome e 2 notas.

    Calcule a média de cada matéria.

    Mostre no final:

    Nome do aluno

    Nome das matérias, notas e média

    Situação: "Aprovado" (média ≥ 6) ou "Reprovado"
*/
import java.util.Scanner;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao sistema da escola");
		System.out.println("Digite o nome do aluno");
		var nome = scanner.next();
		System.out.println("Quantas materias você quer cadastrar");
		var materias = scanner.nextInt();
		System.out.println("Você vai te que digitar 2 notas para cada materia");
		int notas[][] = new int[materias][2]; // Criando uma matriz
		ArrayList<Integer> todas_notas = new ArrayList<>(); // Criando um lista de arrays para armazenar as notas
		//ArrayList<Integer> media_materia = new ArrayList<>();
		var media_materia = 0;
		for(int i = 0; i<materias ;i++){
		    System.out.println("Materias" + (i+1) + ":");
		    for(int j=0;j<2;j++){
		        System.out.print("Digite a nota " + (j + 1) + ": ");
		        notas[i][j] = scanner.nextInt();
		        todas_notas.add(notas[i][j]);
		    }
		}
		var media = 0;
		for(int i=0;i < todas_notas.size();i+=2){
		    media_materia = (todas_notas.get(i) + todas_notas.get(i+1)) / 2;
		    System.out.println(media_materia);
		    media = todas_notas.get(i) / todas_notas.size();
		    media = media + media;
		}
		if(media > 6){
		    System.out.printf("O %s foi aprovado :) \n",nome);
		  }else{
		      System.out.printf("O %s foi reprovado :( \n",nome);
		  }
	}
}
