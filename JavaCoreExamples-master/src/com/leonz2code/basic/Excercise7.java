package com.leonz2code.basic;
//7. Programa Java que declare una variable C de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si el valor de C es positivo o negativo, 
//si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) 
//dentro del println para resolverlo.
public class Excercise7 {

	public static void main(String[] args) {
		
		int C= -50;
		
		System.out.println(C +(C>=0? " ES POSIVITO":" ES NEGATIVO") + 
						  	  (C%2 == 0? " ES PAR" : " ES IMPAR") +
						      (C%5 == 0? " ES MULTIPLO DE 5" : " NO ES MULTIPLO DE 5") +
						      (C%10 == 0? " ES MULTIPLO DE 10" : " NO ES MULTIPLO DE 10") +
						      (C>100? " ES MAYOR A 100" : " ES MENOR A 100")
				
				);

	}

}
