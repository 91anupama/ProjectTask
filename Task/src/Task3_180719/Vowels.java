package Task3_180719;

import java.util.Scanner;

public class Vowels {

	static String str;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		str = sn.nextLine();
		int[] count = new int[5];
		int vowelcount=0;
		int maxchar = 0;

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
				++count[0];
				vowelcount++;
				break;
			case 'e':
				++count[1];
				vowelcount++;
				break;
			case 'i':
				++count[2];
				vowelcount++;
				break;
			case 'o':
				++count[3];
				vowelcount++;
				break;
			case 'u':
				vowelcount++;
				++count[4];
				break;
			default:
				continue;
			}
		}
		int temp;
		int max = count[0];
		 int q;

		for (q=1; q < 4;q++) {
			if (count[q] > max) {
				max = count[q];
				maxchar = q;
				
			}
			
		}
		
		switch (maxchar) {
		case 0:
			System.out.println("a is repeated most: "+max+" Times");
			break;
		case 1:
			System.out.println("e is repeated most: "+max+" Times");
			break;
		case 2:
			System.out.println("i is repeated most: "+max+" Times");
			break;
		case 3:
			System.out.println("o is repeated most: "+max+" Times");
			break;
		case 4:
			System.out.println("u is repeated most: "+max+" Times");
		default:
			System.out.println("Vowels not available");
		}
		//System.out.print("number of repeatition :"+count[i]);
		
		System.out.println("total vowels :"+vowelcount);
	}

}