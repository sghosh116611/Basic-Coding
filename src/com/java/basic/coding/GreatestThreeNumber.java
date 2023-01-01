package com.java.basic.coding;

import java.util.Scanner;

// Program to print greatest of 3 numbers

public class GreatestThreeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Maximum is "+ max);
	}

}
