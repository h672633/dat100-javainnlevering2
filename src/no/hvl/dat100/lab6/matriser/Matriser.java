package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
	
		
		for (int i[] : matrise)  {
			for(int j : i){
				System.out.print(j+ " ");
			
		}
			System.out.println();
		}
	
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		int [][] matriser= { {1,2,3}, 
				             {4,5,6}, 
				             {7,8,9},
				             
				             
		};
		
		String str = "";
	    for (int i = 0; i < matriser.length; i++) {
	        if (i > 0)
	            str += " \n";
	      
	        for (int j = 0; j <matriser[i].length; j++) {
	             if (j> 0)
	               str += " ";
	            str += matriser[i][j];
	        }
	    }
	    str += " \n";
	    System.out.println(str);
	    
	    return str;
	}


	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		  int array[][] = new int[matrise.length][];
		    for (int i = 0; i < matrise.length; i++) {
		        array[i] = new int[matrise[i].length];
		        for (int j = 0; j < matrise[i].length; j++) {
		            array[i][j] = matrise[i][j] * tall;
		            
		            
		        }
		    }
		    
		    return array;
		}
	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

	     int rad1, col1, rad2, col2;    
	        boolean lik = true;    
	    
	          rad1 = a.length;    
	        col1 = a[0].length;    
	    
	          rad2 = b.length;    
	        col2 = b[0].length;    
	       
	        if(rad1 != rad2 || col1 != col2){    
	            System.out.println("Matrisene er ikke like");    
	        }    
	        else {    
	            for(int i = 0; i < rad1; i++){    
	                for(int j = 0; j < col1; j++){    
	                  if(a[i][j] != b[i][j]){    
	                      lik = false;    
	                      break;    
	                  }    
	                }    
	            }    
	                
	            if(lik)    
	                System.out.println("Matrisene er like");    
	            else    
	                System.out.println("Matrisene er ikke like");    
	        }     
	   
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
