package Task3_180719;

import java.util.Scanner;

public class MaxMinAvgTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n, totalsum = 0,avgnum;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want to operate:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        
	        }
	    
	        totalsum=totalMethod(a);
	        System.out.println("Total : "+totalsum);
	        avgnum=avgMethod(a);
	        System.out.println("Average : "+avgnum);
	        int max =maxMethod(a);
	        System.out.println("MAximum : " +max);
	        int min=minMethod(a);
	        System.out.println("Minimum : "+min);
	        
	        
	        
	    }

	private static int avgMethod(int[] a) {
		// TODO Auto-generated method stub
		int sum=0,avg=a[0];
		for(int i = 0; i <a.length; i++)
        {
            sum = sum + a[i];
        }
		avg=sum/a.length;
		return avg;
	}

	private static int totalMethod(int[] a) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i = 0; i <a.length; i++)
        {
            total = total + a[i];
        }
		return total;
	}

	private static int minMethod(int[] a) {
		// TODO Auto-generated method stub
		int minimum=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i] < minimum){
				minimum = a[i];
			}
		}
		return minimum;
	}

	private static int maxMethod(int[] a) {
		// TODO Auto-generated method stub
		int maximum=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i] > maximum){
				maximum = a[i];
			}
		}
		return maximum;
	}

	
	}

