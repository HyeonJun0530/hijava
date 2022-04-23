package hijava.oop;

public class Mom {
	private String name ;
	
	public Mom() {
		this("엄마");
	}
	
	public Mom(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	protected void eat() {
		System.out.println("EAT !");
	}
	public void say() {
		System.out.println("Mom said...");
	}
	public void drinkBeer() {
		System.out.println("맥주");
	}
}
