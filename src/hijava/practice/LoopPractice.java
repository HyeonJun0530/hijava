package hijava.practice;

public class LoopPractice {

	public static void main(String[] args) {
		sumBywhile();
		sumByFor();
		
	}

	private static void sumByFor() {
		int total = 0;
		int total_2=0;
		
		for(int i = 0; i <= 100; i++) {
		total+=i;	
		}
		for(int j= 100; j>=1; j--) {
		total_2+=j;
		}
		System.out.println("For Result is "+total);
		System.out.println("For Result_2 is "+total_2);
	}

	private static void sumBywhile() {
		int i=0;
		int total=0;
		
		while(++i<= 100) {
			if(i % 2 == 0)continue;
			
			total+=i;
		}
		System.out.println("Result is " + total);
	}

}
