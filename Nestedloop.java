package Javabasicdemo;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nested for loop pattern 
		 System.out.println("Simple pattern");
        for(int w=1;w<=5;w++)
		 {
			 for(int v=1;v<=w;v++)
			 {
				 System.out.print("!");
			 }
			 System.out.println();
			 
		// pyramid pattern
		 System.out.println(" Pyramid pattern");

			 for (int i = 1; i <= 5; i++) {
		            // print spaces
		            for (int j = i; j < 5; j++) {
		                System.out.print(" ");
		            }
		            // print stars
		            for (int k = 1; k <= (2 * i - 1); k++) {
		                System.out.print("*");
		            }
		            // move to next line
		            System.out.println();
		        }
//reverse pyramid pattern
			 System.out.println("Reverse Pyramid pattern");

			 for (int m = 5; m >= 1; m--) {
		            // print spaces
		            for (int n = 5; n > m; n--) {
		                System.out.print(" ");
		            }
		            // print stars
		            for (int p = 1; p <= (2 * m - 1); p++) {
		                System.out.print("*");
		            }
		            // move to next line
		            System.out.println();
		        }

			 /*for (int k = 5; k >= 1; k--) {// Inner loop for columns
		         for (int x = 1; x <= k; x++) {
		             System.out.print("*");  // Print star
		         }
		         System.out.println();       // Move to next line
		     
			 }*/ 
	  }
	}
}