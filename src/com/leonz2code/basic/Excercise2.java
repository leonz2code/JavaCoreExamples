package com.leonz2code.basic;
//2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. 
//A continuación reliza y muestra muestra por pantalla una serie de operaciones entre ellas. 
import java.text.DecimalFormat;

public class Excercise2 {

	public static void main(String[] args) {

		int x,y;
		double n,m;
		
		x=10;
		y=15;
		
		n=16.6;
		m=12.23;
		
		int sumInt = x + y;
		double sumDoble = n + m;
		
		double multMix = y * m;
		
		double pi=3.1415926535897932384626433832795028841971693993751;
		
		System.out.println("La Suma entera de x e y es " + sumInt);
		System.out.println("La suma dobleprecision de m y en es " + sumDoble);
		System.out.println("La multiplicacion mixta de y por m es " + multMix);
		
		System.out.println("Para usar solo 2 decimales utilizamos Math.round" );
		
		multMix=Math.round(multMix*100)/100.0;
		
		System.out.println("La multiplicacion mixta de y por m es " + multMix);
		
		
		 //Fist Method by using round
		 double rounded = Math.round(pi);
		 System.out.println("the pi value rounded will return only 3.0  value returnded " + rounded);

		 
		 double rounded_2 = Math.round(pi*100)/100.0;
		 System.out.println("Now the pi value rounded will return  2 decimal places " + rounded_2);
		 
		 double rounded_3 = Math.round(pi*1000)/1000.0;
		 System.out.println("Now the pi value rounded will return  3 decimal places " + rounded_3);
		 
		 
		 // Second Method by using printf "%f" means decimal
		
		System.out.printf("by using printf this returns 2 decimals"+"%.2f" + "\n", pi);
		
		System.out.printf("by using printf this  returns 3 decimals"+"%.3f" + "\n", pi);
		
		// Third by using DecimalFormat
		
		DecimalFormat dFormatter= new DecimalFormat("#.####"); // Ex #.### or #.####
		String formatted = dFormatter.format(pi); 
		System.out.println("by using this class we an only add # and will show the decimals " + formatted);
		//

		
// for place decimals one way ( that I like anyways) is to use Math.round
		
		
		
	}

}
