package com.leonz2code.basic;
//6. Programa Java que declare una variable B de tipo entero y as�gnale un valor. A continuaci�n muestra un mensaje indicando si el valor de B es positivo o negativo. 
//Consideraremos el 0 como positivo. Utiliza el operador condicional (? : ) dentro del println para resolverlo.
public class Excercise6 {

	public static void main(String[] args) {

		int B=-9;
		
		System.out.println(B + ( B>=0 ? " ES POSIVITO" : " ES NEGATIVO"));

	}

}
