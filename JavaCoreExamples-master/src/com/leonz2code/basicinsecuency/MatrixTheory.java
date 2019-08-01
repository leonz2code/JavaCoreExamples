package com.leonz2code.basicinsecuency;


//	
//	for (int x=ctd-1;x>=0;x--){
//		
//		for(int y=0;y<ctd;y++){
//			
//
//			if((ctd_1 - y != 0) && (ctd_1 -y >=0) ){
//				
//				arr[x][y]='#';
//			}
//		
//		}
//		ctd_1--;
//	}
//	
//
//	output.-
//	
//	4
//	#   
//	##  
//	### 
//	####
	

public class MatrixTheory {

	public static void main(String[] args) {


	int mtx=3;
	int ctd_1=0;
		
	int arr[][]=new int[mtx][mtx];
		
		
		for (int x=0;x<mtx;x++){
			for(int y=0;y<mtx;y++){
				ctd_1++;
				arr[x][y]=ctd_1;
			}		
		}	


		for(int i=0;i<mtx;i++){
			
			for(int y=0;y<mtx;y++){
				
				System.out.print("" + arr[i][y]);
			}
			System.out.println();
		}	
	}

}
