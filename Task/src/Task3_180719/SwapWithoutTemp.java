package Task3_180719;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=11;
		
		System.out.println("Variable before swap:");
		System.out.println("a : "+a+"\nb : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Variavles after swap:");
		System.out.println("a : "+a+"\nb : "+b);

	}

}
