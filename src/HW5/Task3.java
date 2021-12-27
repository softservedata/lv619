package HW5;

import java.util.Scanner;

public class Task3 {

	public enum Continents {
		Eurazia, Africa, Australia, NorthAmerica, SouthAmerica, Antarctica
	}

	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);
		System.out.println("Enter the country:");
		String c = str.nextLine();

		switch (c) {
		case "ukraine":
		case "poland":
		case "germany":
		case "france":
		case "portugal":
		case "england":
		case "spain":
		case "china":
		case "japan":
			System.out.println(Continents.Eurazia);
			break;
		case "egypt":
		case "libya":
		case "morocco":
		case "kenya":
		case "gabon":
			System.out.println(Continents.Africa);
			break;
		case "sydney":
			System.out.println(Continents.Australia);
			break;
		case "brasil":
		case "argentina":
		case "ecuador":
		case "colombia":
		case "paraguay":
			System.out.println(Continents.NorthAmerica);
			break;
		case "usa":
		case "canada":
		case "mexico":
			System.out.println(Continents.SouthAmerica);
			break;
		case "McMurdo":
			System.out.println(Continents.Antarctica);
			break;
		default:
			System.out.println("Sorry) I don't know what you mean");
		}

	}

}
