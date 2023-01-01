package com.java.basic.coding;

import java.util.Scanner;

// Program to print greatest of two number

public class GreatestNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = a > b ? a : b;
		System.out.println("Maximum value is "+ max);
	}

}
