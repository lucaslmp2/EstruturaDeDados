package aula5_2;

import java.util.LinkedList;

import java.util.Queue;



import java.util.Random;



public class Aula5_2 {

	public static void main(String[] args) {
//		3 - Escreva um programa que leia 10 numeros inteiros:
//			Se o numero for par, coloque ele em uma fila;
//			Se o numero for impar, coloque ele em uma outra fila;
//			Se o numero for 0 retire um elemento da fila par;
//			Exiba as duas filas;
		//Scanner ler = new Scanner(System.in); //Leitura do teclado
		Queue<Integer> filaPar = new LinkedList<>();//Criacao da fila vazia
		Queue<Integer> filaImpar = new LinkedList<>();//Criacao da fila vazia
		Random rand = new Random(); //Criacao do objeto de gerar numero aleatorio
		int n;
		for(int i=0;i<=10;i++) {
			n = rand.nextInt(10);
                        if(n==0) {
				filaPar.poll();
                                
			}
			if(n % 2==0) {
				filaPar.add(n);
			}else {
				filaImpar.add(n);
			}
			
                        
		}
              
		System.out.println("lista de pares: "+ filaPar);
		System.out.println("lista de impares: "+ filaImpar);
              
	
	}		
}
