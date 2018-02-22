package com.leonz2code.core;

public class NumerosPrimos {

	public static void main(String[] args) {
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 



		public static boolean esPrimo(int numero){
			int contador = 2;
			boolean primo=true;
			while ((primo) && (contador!=numero)){
			if (numero % contador == 0)
			primo = false;
			contador++;
			}	

*/

	//	int ctd=0;
		
	//	boolean primo=true;
		
		  int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }
	       
	       
	       
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	       

		
		
		
		
		
		
		/*
		boolean primo=true;				
		
		for(int i=2;i<16;i++){
	
				for(int x=2;x<i;x++){								
				
						if(i % x == 0){					
							primo=false;	
							System.out.println("test");
						}
				
			
				}
			
			if((i % 2 != 0) && (primo=true)){
				
				System.out.println(""+i);
				
			}
			
			
		}
	
		
		*/
		
		
		/*


				if(x % 2 != 0){
					primo=true;					
					
				}



		for (int i=0;i<100;i++){
			
			
		
		
		
				
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=i)){
		if (i % contador == 0)
		primo = false;
		contador++;
		}			
			System.out.println(""+contador);
		}		
				
			
			*/	
				
				
				
				
				
				
				
}
}
