package com.java.basic.coding;

import java.util.Scanner;

//Program to print all Math operations

public class AllOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n = sc.nextInt();
		System.out.println("Enter the second number");
		int m = sc.nextInt();
		System.out.println(" Add:" + add(n, m) + "\n Subtract:" + subtract(n, m) + "\n Multiply:" + multiply(n, m)
				+ "\n Divide:" + divide(n, m) + "\n Modulus:" + mod(n, m));

	}

	private static int mod(int n, int m) {
		return n % m;
	}

	private static double divide(int n, int m) {
		return n / m;
	}

	private static int multiply(int n, int m) {
		return n * m;
	}

	private static int subtract(int n, int m) {
		return n - m;
	}

	private static int add(int n, int m) {
		return n + m;
	}

}
