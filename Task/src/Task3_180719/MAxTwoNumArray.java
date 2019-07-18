package Task3_180719;

import java.util.Scanner;

public class MAxTwoNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want to operate:");
		int n = s.nextInt();
		int a[] = new int[n];
		int max1 = 0;
		int max2 = 0;
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			if (max1 < a[i]) {
				max2 = max1;
				max1 = a[i];
			} else if (max2 < a[i]) {
				max2 = a[i];
			}
		}
		System.out.println("First maximum = "+max1 +"\nSecond Maximum ="+max2);

	}

}
