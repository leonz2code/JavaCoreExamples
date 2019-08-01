package com.leonz2code.basicinsecuency;

import java.util.Scanner;

public class QuarterRombo {

	public static void main(String[] args) {
		
		int ctd;
		int test=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please Type the Matrix Dimention");
		ctd = sc.nextInt();		
		int ctd_1=ctd;
		
		char arr[][]=new char[ctd][ctd];
		
		for (int x=0;x<ctd;x++){
			for(int y=0;y<ctd;y++){
				arr[x][y]=' ';
			}		
		}	
		
		for (int x=ctd-1;x>=0;x--){
			for(int y=0;y<ctd;y++){
				test++;					
					if((ctd_1 - y != 0) && (ctd_1 -y >=0) ){		
								arr[y][x]='#';
					}

			}
	ctd_1--;
	}	

		for (int x=0;x<ctd;x++){
			for(int y=0;y<ctd;y++){
				System.out.print(""+arr[x][y]);
			}			
		System.out.println();
		}

		}
}

