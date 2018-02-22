package com.leonz2code.basic;

public class palindromo_Demo {

	public static void main(String[] args) {

		String palindromo="anitalavalatina";
		String inverso="";
		
		
	//	System.out.println(""+ palindromo.charAt(1));
		
/*		
		for(int i=0;i<palindromo.length();i++){
			
			System.out.println(""+ palindromo.charAt(i));	
			
			
		}
*/
		for(int i=palindromo.length()-1;i>=0;i--){
			
			inverso+=palindromo.charAt(i);
			
		//	System.out.println(""+ palindromo.charAt(i));	
			
			
		}	
		
		System.out.println(""+palindromo);
		System.out.println(""+inverso);
		
		
		if (palindromo.equals(inverso)){
			
			
			System.out.println("el String evaluado es un palindromo");
		}
		
		
		
	}

}
