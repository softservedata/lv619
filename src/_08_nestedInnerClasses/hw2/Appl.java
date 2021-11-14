package _08_nestedInnerClasses.hw2;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create Wrapper<T>  class with private field of T type which is called value.
	//	In Wrapper class create public constructor and
	//	setValue and getValue methods for value field.
	//	Create three objects of the Wrapper type:
	//	first object should be wrapper for int type, second – for String, third - for boolean.
	//	Print all three values in the console using method getValue from Wrapper class.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Wrapper<Integer> wrapper1 = new Wrapper<>();
		Wrapper<String> wrapper2 = new Wrapper<>();
		Wrapper<Boolean> wrapper3 = new Wrapper<>();
		wrapper1.setValue(123);
		wrapper2.setValue("abc");
		wrapper3.setValue(true);
		System.out.println(wrapper1.getValue());
		System.out.println(wrapper2.getValue());
		System.out.println(wrapper3.getValue());
	}
	////////////////////////////////////////////////////////////////////////////
}