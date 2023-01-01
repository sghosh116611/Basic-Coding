package com.java.basic.coding;

import java.util.Scanner;

// Table of a number

public class NumberTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(n+"*"+i+"="+(n * i));
		}
	}

}
