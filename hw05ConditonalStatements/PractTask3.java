package hw05ConditonalStatements;
import java.util.Scanner;
public class PractTask3 {
	
	enum Continents {
		Eurazia("Eurazia"),
		Africa("Africa"), 
		North_America("North America"), 
		South_America("South America"),
		Antarctica("Antarctica"), 
		Australia("Australia");
		
		private String continent;
		private Continents(String c) {
			this.continent = c;
		}
		
		public String getCont() {
			return continent;
		}
	
	}
	
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Print the name of the coutry:");
		String countrycheck = in.nextLine();
		countrycheck = countrycheck.toLowerCase();
		
		switch (countrycheck) {
		case "australia":
			System.out.println(Continents.Australia.getCont());
			break;
		
		case "usa":
		case "canada":
		case "mexico":
			System.out.println(Continents.South_America.getCont());
			break;
		
		case "brasil":
		case "argentina":
		case "ecuador":
		case "colombia":
		case "paraguay":
			System.out.println(Continents.North_America.getCont());
			break;
		
			
		case "egypt":
		case "libya":
		case "morocco":
		case "kenya":
		case "gabon":
		//other case "coutryName":
			System.out.println(Continents.Africa.getCont());
			break;
		
		case "france":
		case "china":
		case "japan":
		case "ukraine":
		case "poland":
		case "england":
		case "portugal":
		case "spain":
		case "germany":
			System.out.println(Continents.Eurazia.getCont());
			break;
			
		default :
			System.out.println("Unknown outry or wrong country name");
			break;
		}
	
		in.close();	
		
	}

}
