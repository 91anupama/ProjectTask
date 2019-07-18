package Task3_180719;

import java.util.Scanner;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string: ");
	     str = in.nextLine();
	     System.out.println("Input String is: "+str);
	     System.out.println("Duplicate characters are:");
	     char[] s=str.toCharArray();
	     

	     for(int i=0;i<str.length();i++) {
	    	 int cnt=1;
	    	 for(int j=i+1;j<str.length();j++) {
	    		 if((s[i]==s[j]) &&(s[i]!=' ') ) {
	    			 System.out.println(s[j]);
	    			 cnt++;
	    			 break;
	    			 
	    		 }
	    		 
	    		 
	    	 }
	    	 
	    	 
	     }
	}

}
