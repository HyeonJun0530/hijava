package hijava.practice;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		System.out.println("result=" + fact(num));
	}

	private static int fact(int num) {
		System.out.println("factorial(" + num + ")");
		
		if(num<=1) return 1;
		
		return num*fact(num-1);
	}
}
