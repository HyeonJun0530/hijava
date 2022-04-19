package hijava.practice;

public class Single {
private static Single instance = new Single();
    
    private Single() {
        // 생성자는 외부에서 호출못하게 private 으로 지정해야 한다.
    }

    public static Single getInstance() {
        return instance;
    }

    public void say() {
        System.out.println("hi, there");
    }

	public static void main(String[] args) {
		Single s=Single.getInstance();
		System.out.println(s);
		
	}

}
