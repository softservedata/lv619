package HW1;

public class HT01 {

	public static void main(String[] args) {

		int a = 16;
		int b = 26;

		System.out.println("a =" + a);
		System.out.println("b =" + b);

		int result1 = a + b;
		int result2 = a - b;
		int result3 = a * b;
		int result4 = a / b;

		System.out.println("���������� = " + result1);
		System.out.println("��������� = " + result2);
		System.out.println("��������� = " + result3);
		System.out.println("������� 1 = " + result4); // false
		System.out.println("��� ����?");

		double c = a;
		double d = b;

		double result5 = c / d;

		System.out.println("������� 2 = " + result5);

		System.out.println("How are you?");

		String answer = "fine.";

		System.out.println("I am " + answer);

	}

}