package com.leonz2code.basic;
//4. Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor acada una. A continuación realiza las instrucciones necesarias para que: B tome el valor de C, 
//C tome el valor de A, A tome el valor de D, D tome el valor de B. 
public class Excercise4 {

	public static void main(String[] args) {

		int A,B,C,D,AUX;
		
		A=5;
		B=10;
		C=12;
		D=2;
		
		System.out.println("Valores Iniciales " + A + " " + B + " " + C + " " + D);
		
		AUX=B;
		B=C;// 10 cambia a 12
		C=A;// 12 cambia a 5
		A=D;// 5 cambia a 2
		D=AUX;// 2 cambia a 10
		
	// in this case was required to change B because is the first in have changes
		
		
		System.out.println("Valores finales " + A + " " + B + " " + C + " " + D);
		
	}

}
