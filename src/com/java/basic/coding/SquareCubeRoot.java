package com.java.basic.coding;

import java.util.Scanner;

// Program to print square and cube root

public class SquareCubeRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		double sqRoot = Math.sqrt(a);
		double cbRoot = Math.cbrt(a);

		System.out.println("Square root is:" + sqRoot + "\nCube root is:" + cbRoot);
	}
}
