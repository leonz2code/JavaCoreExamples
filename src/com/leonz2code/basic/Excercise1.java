package com.leonz2code.basic;

//       * 1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char
//       *  y asigna a cada una un valor. A continuaci�n muestra por pantalla: El valor de cada variable, la suma de N + A, la diferencia de A - N, el valor 
//       *  num�rico correspondiente al car�cter que contiene la variable C.


public class Excercise1 {

	public static void main(String[] args) {

		int N = 50;
		double A = 25.5;
		char C = 'C';

		double sum = N + A;
		double rest = N - A;

		System.out.println("el valor de las variables es " + N + " " + A + " " + C);
		System.out.println("La suma de int N mas double A es " + sum);
		System.out.println("La resta de int N menos double A es " + rest);
		System.out.println("el valor numerico de char C es " + Character.getNumericValue(C));
		System.out.println("el valor numerico de char C es " + (int)C);

	}
/*



A character's "numeric value" is not its ASCII/Unicode index value. The Character.getNumericValue method will attempt to convert the char to an int by applying the character's numeric meaning:

Returns the int value that the specified Unicode character represents. For example, the character '\u216C' (the roman numeral fifty) will return an int with a value of 50. The letters A-Z in 
their uppercase ('\u0041' through '\u005A'), lowercase ('\u0061' through '\u007A'), and full width variant ('\uFF21' through '\uFF3A' and '\uFF41' through '\uFF5A') forms have numeric values from 10 through 35. 
This is independent of the Unicode specification, which does not assign numeric values to these char values.

If the character does not have a numeric value, then -1 is returned. If the character has a numeric value that cannot be represented as a nonnegative integer (for example, a fractional value), then -2 is 
returned.

It is expected that getNumericValue will not agree with casting the char to an int.




 * */
	


}
