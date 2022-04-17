package hijava.practice;

import java.util.Iterator;

public class SumPrimeNum {

	public static void main(String[] args) {
		if(args.length>0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
		int total = 0;
		for(int num = 2; num<=100; num++) {
			if(isPrime(num))
				total+=num;
		}
		System.out.println("Result is " + total);
	}
//소수를 판별하라!!
	private static boolean isPrime(int num) {
		for(int j = 2; j<num; j++) {
			if(num % j == 0) {
				return false;
			}
				
		}
		return true;
	}

}
