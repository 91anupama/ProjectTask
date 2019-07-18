package Task3_180719;

import java.util.Scanner;

public class Additionwithoutplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a, b ;
		   Scanner in = new Scanner(System.in);	
		   System.out.print("Input first number: ");
		   a = in.nextInt(); 
		   System.out.print("Input second number: ");
		   b = in.nextInt(); 
	      while(b != 0){
	            int carry = a & b;
	            a = a ^ b;
	            b = carry << 1;
	        }
	        System.out.print("Sum: "+a); 
			System.out.print("\n"); 

	}

}
