package com.java.basic.coding;
//Sample program to print first N natural numbers

import java.util.Scanner;

public class FirstNNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter N");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
