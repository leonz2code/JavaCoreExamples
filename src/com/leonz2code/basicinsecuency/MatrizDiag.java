package com.leonz2code.basicinsecuency;

import java.util.Scanner;

public class MatrizDiag {

	public static void main(String[] args) {

		int mtx=0;
		int ctd=0;
		int dec=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please Type the Matrix Dimention");
		mtx = sc.nextInt();
		ctd = mtx;
		
		int arrMtx[][]=new int[mtx][mtx];
		
		for(int i=0;i<mtx;i++){
			
			for(int y=0;y<mtx;y++){
		//		ctd++; el contadodr a qui cuenta todos los elementos del arreglo
				arrMtx[i][y]=0;
			}
		}
	
		// IS VERY IMPORTANT TO NOTICE THAT THE COORDINATES ARE REPRECENTED BY MAXIMUM VALUES FOR THIS ARRAY EXAMPLE
		
//		
//		EXMAPLE.-
//		x0 x1 x2 x3 
//		2005  y0
//		0000  y1
//		0000  y2
//		7003  y3
//		
//		THE COORDINATE OF 3 ARE arr[3][3]
//	    THE COORDINATE OF 7 ARE arr[0][3]
//	    THE COORDINATE OF 5 ARE arr[3][0]
//	    THE COORDINATE OF 2 ARE arr[0][0]				
		
//    JAVA interpreter take arr "x" "y" coordinates ex.- arr[x][y][z]		
		
		
		
		
		
		
		for(int i=mtx-1;i>0;i--){

			for(int y=mtx-1;y>=0;y--){
						if(ctd>=0){							
							arrMtx[i][y]=ctd;							
							ctd--;
						}
												

			}			
			dec++;
			ctd=mtx-dec;		
		}		
		
		arrMtx[0][mtx-1]=1;
		
		for(int i=0;i<mtx;i++){
			
			for(int y=0;y<mtx;y++){
				
				System.out.print("" + arrMtx[i][y]);
			}
			System.out.println();
		}	
		
		
		
		
	}

}
