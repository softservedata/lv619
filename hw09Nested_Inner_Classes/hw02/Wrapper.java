package hw09Nested_Inner_Classes.hw02;

public class Wrapper <T> {
	
	public T value;
	
	public Wrapper() {}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T t) {
		this.value = t;
	}
	
	public static void main(String[] args) {
		
		Wrapper<Integer> wr1 = new Wrapper<>();
		Wrapper<String> wr2 = new Wrapper<>();
		Wrapper<Boolean> wr3 = new Wrapper<>();
		
		wr1.setValue(25);
		wr2.setValue("26");
		wr3.setValue(true);
		
		System.out.println(wr1.getValue());
		System.out.println(wr2.getValue());
		System.out.println(wr3.getValue());
	}

}
