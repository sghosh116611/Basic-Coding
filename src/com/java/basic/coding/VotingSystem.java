package com.java.basic.coding;

import java.util.Scanner;

//Program to check if candidate is eligible to vote or not. Candidate is eligible only if :- 
//1. Age is older than or equal to 18

public class VotingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Vote");
		}else {
			System.out.println("Can not vote");
		}
	}

}
