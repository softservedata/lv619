package hw11Strings_Reges.prTask1;

public class Appl {
	
	public static void main(String[] args) {
		
		
		String str1 = "IT";
		String str2 = "blablaITblabla";
		
		if(str2.contains(str1)) {
			System.out.println("Contains");
		}
		else {
			System.out.println("Doesn't contains");
		}
	}

}
