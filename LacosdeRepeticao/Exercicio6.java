package LacosdeRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int n1,media;
		
		
		  Scanner ler = new Scanner(System.in);
		  
		 		  
		  System.out.print("digite um numero  :");
		  n1 = ler.nextInt();
		  
		  do {
			  media= n1/n1;
			  System.out.print(" "+(n1/3)/media);
			  n1 = ler.nextInt();
			  
			  
		  } while (n1==0);
		  System.out.print("fim do programa  :");

	}

}
