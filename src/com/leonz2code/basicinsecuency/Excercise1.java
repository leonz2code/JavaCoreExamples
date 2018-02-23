package com.leonz2code.basicinsecuency;

import java.util.Scanner;

//1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
public class Excercise1 {

	public static void main(String[] args) {

String n1;
int n2=0;
Scanner sc= new Scanner(System.in);


	
//	
	System.out.println("Please Type the first Number");
//	
	n1 = sc.nextLine();

	try {
		n2 = Integer.parseInt(n1);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		// e.printStackTrace();
		System.out.println("is not a number");
		n2 =verifyInput(n2);
		
	}
	
	
//	System.out.println("You have typed the numbers " + n1 + " " + n2);	
//	
		int test=validaNum(4);
		
		System.out.println(""+test);
		System.out.println(""+n2);
	
	}

	

	
	
	
	
	public static int validaNum(int num){
		
		
		int val = num + num;
		/*
		do {
			
			// read first number
			System.out.println("Please Type the first  Number");	
			if(sc.hasNextInt()){
				n1 = sc.nextInt();
				isNumber = true;
			
			} else {
					System.out.println("I dont understand you");
					isNumber = false;
					sc.next();				
			}
			
			
			
		} while (!(isNumber));

		
		
		*/
		return val;		
		
		}
		
	public static int verifyInput(int num){	
		boolean isNumber;	
		int val=0;
		Scanner sc= new Scanner(System.in);
		
		do {
			
			// read first number
			System.out.println("Please Type the first  Number");	
			if(sc.hasNextInt()){
				val = sc.nextInt();
				isNumber = true;
			
			} else {
					System.out.println("I dont understand you");
					isNumber = false;
					sc.next();				
			}
			
			
			
		} while (!(isNumber));
		
		return val;
	}
	
	
	
	
	
}
