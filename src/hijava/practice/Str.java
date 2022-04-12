package hijava.practice;

public class Str {
	public static void main(String[] agrs) {
		char c='한';
		byte b='A';
		System.out.println(c);
		System.out.println((int)c);
		System.out.println(b);
		
		String str = "AB";
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		System.out.println("AB��".getBytes().length);

	}
}
