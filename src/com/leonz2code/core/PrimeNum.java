package com.leonz2code.core;

public class PrimeNum {

	public static void main(String[] args) {
			
		
		for(int i=1;i<100;i++){
				int ctd=0;
				for(int x=i;x>=1;x--){								
				
						if(i % x == 0){
								ctd+=1;
									  }					
				}		
				if(ctd == 2){
					
					System.out.println(""+i);
				}
		}

	}

}

/*
 * Explanation
 * 
 * for the first for loop the "ctd" is initialized to zero every time this is for every cycle to have the rules of prime numbers only divided for itself and one
 * the first if condition "(i % x == 0)" verify if we have exact divided and increments the counter and is placed in the second for loop.
 * the second if (ctd == 2) is referenced to the first for loop and prints only those numbers that satisfy the condition to be prime numbers.
 * 
 */