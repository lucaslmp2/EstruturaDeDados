//package Aula5;
//import java.util.*;  
//public class Aula5 {
//	
//	public static void main(String[] args) {
//		Queue<String> filas = new LinkedList<>();
//		
//		filas.add("Lucas");
//		System.out.println(filas);
//		System.out.println(filas.size());
//		filas.poll();
//		System.out.println(filas);
//		System.out.println(filas.size());
//		filas.add("Lucas");
//		System.out.println(filas);
//		System.out.println(filas.size());
//package Aula5;
//
//import java.util.Stack;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		//Pilha de atividades para desenvolver
//		Stack<String> pilha = new Stack<>();
//		
//		Stack<String> pilhaI = new Stack<>();
//		
//		pilha.push("Ler projeto");
//		pilha.push("Pesquisar padrões");
//		pilha.push("Codificar");
//		pilha.push("Testar");	
//		
//		System.out.println(pilha);
//		
//		pilhaI.push(pilha.pop());
//		pilhaI.push(pilha.pop());
//		pilhaI.push(pilha.pop());
//		pilhaI.push(pilha.pop());
//		
//		
//		System.out.println(pilhaI);
//		
//								
//	}
//	
//}
package Aula5;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Random;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		1- escreva um programa que leia 10 numeros inteiros:
//		Insira os numeros inteiros na fila;
//		Exiba a fila criada;
		
//		2 - escreva um programa que leia 10 numeros inteiros:
//			se o numero for par, coloque ele na fila;
		
//		3 - escreva o programa que leia 20 numeros inteiros:
//		se for par coloque ele em uma fila;
//		se for impar coloque em outra fila;
//		so for 0 retire um elemento da fila par;
//		Exiba as duas filas;
		
		
	//Scanner ler = new Scanner(System.in); //Leitura do teclado
	
	Queue<Integer> fila = new LinkedList<>();
	
	Queue<Integer> impar = new LinkedList<>();
	
	
	Random rand = new Random();
	
	int n;
	
	
	for(int i=0;i<20;i++) {
	System.out.println("Escreva o número: "+(i+1+":"));	
		n = rand.nextInt(20);
		
		
	
		if(n%2==0) {
			fila.add(n);
			
		}else {
			
				impar.add(n);
			
		}
		if(n==0) {
			fila.poll();
		}
	}
	
	System.out.println("Voce digitou: "+ fila);
	System.out.println("Voce digitou: "+ impar);
		
	}
	
}
