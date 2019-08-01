package com.leonz2code.basic;
//5. Programa Java que declare una variable A de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) 
//dentro del println para resolverlo. 
public class Excersice5 {

	public static void main(String[] args) {

		int A=23;
		
		
		System.out.println(A +(A%2==0 ? " ES PAR" : " ES IMPAR"));

	}

}
