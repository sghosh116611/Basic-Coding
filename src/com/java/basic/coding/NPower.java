package com.java.basic.coding;

//Program for N power of a number

import java.util.Scanner;

public class NPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the exponent");
		double exp = sc.nextDouble();
		System.out.println("Enter the base");
		double base = sc.nextDouble();

		double res = Math.pow(base, exp);
		System.out.println("Result is " + res);
	}

}
