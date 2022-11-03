package com.itb.primitive;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Equação_2Grau {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner tcd = new Scanner( System.in);
		System.out.println("escreva o valor de A");
		a = tcd.nextDouble();
		System.out.println("escreva o valor de B");
		b = tcd.nextDouble();
		System.out.println("escreva o valor de C");
		c = tcd.nextDouble();
		
		System.out.println("bascara calculada: ");
	
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		
		System.out.println(delta);
		
		double raiz1 = (-b + Math.sqrt(delta))/2*a;
		
		double raiz2 = (-b - Math.sqrt(delta))/2*a ;
		
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		System.out.print("primeira raiz da equação: " + formatter.format(raiz1) +" segunda raiz da equação: " + formatter.format(raiz2) + "\n" );
		
		
	}

}
