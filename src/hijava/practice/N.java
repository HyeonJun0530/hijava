package hijava.practice;

public class N {
	int x=10;
	int y=20;
	
		public void swap() {
			int t=x;
			x=y;
			y=t;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N n=new N();
		System.out.println("x="+n.x);
		System.out.println("x="+n.y);
		n.swap();
		System.out.println("----------------------------");
		System.out.println("x="+n.x);
		System.out.println("x="+n.y);
	}

}
