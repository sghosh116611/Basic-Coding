package com.java.basic.coding;

//Program to test for positive and negative numbers

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(n < 0 ) {
			System.out.println("Negative");
		}else {
			System.out.println("Positive");
		}
	}
}
