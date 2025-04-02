package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double n1,n2,sub;
		
		System.out.println("digite um numero:");
		 n1 = sc.nextDouble();
		 
		 System.out.println("digite outro numero:");
		 n2 = sc.nextDouble();
		 
		 sub = n1 - n2;
		 
		 System.out.println("a subtração do primeiro numero pelo segundo é:" + sub);
		

	}

}
