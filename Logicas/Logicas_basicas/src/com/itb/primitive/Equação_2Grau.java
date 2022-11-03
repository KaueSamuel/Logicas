package com.itb.primitive;

import java.util.Scanner;

public class Equação_2Grau {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner tcd = new Scanner( System.in);
		System.out.println("escreva o valor de A");
		a = tcd.nextDouble();
		System.out.println("escreva o valor de A");
		b = tcd.nextDouble();
		System.out.println("escreva o valor de C");
		c = tcd.nextDouble();
		
		System.out.println(" bascara calculada: ");
	
		Double delta = (b * b) - 4 * a * c;
		
		System.out.println(delta);
	}

}
