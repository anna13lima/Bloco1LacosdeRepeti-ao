package LacosdeRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int n1,soma;
	
				
		  Scanner ler = new Scanner(System.in);
		  
		 		  
		  System.out.print("digite um numero  :");
		  n1 = ler.nextInt();
		  
		  do {
			  soma= n1+n1;
			  System.out.print(" "+soma);
			  n1 = ler.nextInt();
			  	
			  
			  
		  }while (n1<0);
		  System.out.print(" fim do programa ");
		  

	}

}
