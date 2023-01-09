package com.athira.array;
import java.util.Scanner;

public class Array {
	static  Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many days you want to keep track/enter the size of transaction array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the daily transaction into transaction array: ");
		for(int i=0; i< size;i++) {
			arr[i] = sc.nextInt();
			
			}
		System.out.println("Enter the total number of targets that needs to be achieved: ");
		int targetNumber = sc.nextInt();
		while(targetNumber-- != 0) {
			int flag = 0;
			long targetValue;
			long sum=0;
			System.out.println("Enter the value of your target");
			targetValue = sc.nextLong();
			for(int i=0;i<size;i++) {
				sum = sum+arr[i];
				if(sum>=targetValue) {
					System.out.println("Target value achieved after "+(i+1)+ " transactions..");
					flag = 1;
					break;
				}
				
				}
			if(flag==0) {
				System.out.println("Given target amount is not achieved");
			}
		}
		
		
		

	}

}
