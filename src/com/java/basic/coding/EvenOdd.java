package com.java.basic.coding;

import java.util.Scanner;

// Program to test for even or odd

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
