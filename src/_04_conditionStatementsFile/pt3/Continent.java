package _04_conditionStatementsFile.pt3;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

enum Continent {
	////////////////////////////////////////////////////////////////////////////
	AFRICA("Africa"),  ASIA("Asia"), 
	EUROPE("Europe"),  NORTH_AMERICA("North America"), 
	OCEANIA("Oceania"), SOUTH_AMERICA("South America");
	////////////////////////////////////////////////////////////////////////////
	private String name;
	private List<State> states;
	static final Map<String, List<String>> multiLocatedStates = new TreeMap<>();
	////////////////////////////////////////////////////////////////////////////
	private Continent(final String name){
		this.name = name;
		switch(name) {
			case "Africa": states = new ArrayList<>(List.of(State.initializeState("Algeria"), State.initializeState("Angola"), State.initializeState("Benin"), State.initializeState("Botswana"), State.initializeState("Burkina Faso"), State.initializeState("Burundi"), State.initializeState("Cabo Verde"), State.initializeState("Cameroon"), State.initializeState("Central African Republic"), State.initializeState("Chad"), State.initializeState("Comoros"), State.initializeState("Democratic Republic of the Congo", "Zaire"), State.initializeState("Republic of the Congo"), State.initializeState("Djibouti"), State.initializeState("Egypt"), State.initializeState("Equatorial Guinea"), State.initializeState("Eswatini", "Swaziland"), State.initializeState("Ethiopia"), State.initializeState("France"), State.initializeState("Gabon"), State.initializeState("Gambia"), State.initializeState("Ghana"), State.initializeState("Guinea"), State.initializeState("Guinea-Bissau"), State.initializeState("Italy"), State.initializeState("Ivory Coast"), State.initializeState("Kenya"), State.initializeState("Lesotho"), State.initializeState("Liberia"), State.initializeState("Libya"), State.initializeState("Madagascar"), State.initializeState("Malawi"), State.initializeState("Mali"), State.initializeState("Mauritania"), State.initializeState("Mauritius"), State.initializeState("Morocco"), State.initializeState("Mozambique"), State.initializeState("Namibia"), State.initializeState("Niger"), State.initializeState("Nigeria"), State.initializeState("Portugal"), State.initializeState("Rwanda"), State.initializeState("Sao Tome and Principe"), State.initializeState("Senegal"), State.initializeState("Seychelles"), State.initializeState("Sierra Leone"), State.initializeState("Spain"), State.initializeState("Somalia"), State.initializeState("South Africa"), State.initializeState("South Sudan"), State.initializeState("Sudan"), State.initializeState("Tanzania"), State.initializeState("Togo"), State.initializeState("Tunisia"), State.initializeState("Uganda"), State.initializeState("Yemen"), State.initializeState("Zambia"), State.initializeState("Zimbabwe"))); break;
			case "Asia": states = new ArrayList<>(List.of(State.initializeState("Afghanistan"), State.initializeState("Armenia"), State.initializeState("Azerbaijan"), State.initializeState("Bahrain"), State.initializeState("Bangladesh"), State.initializeState("Bhutan"), State.initializeState("Brunei"), State.initializeState("Cambodia", "Kampuchea"), State.initializeState("China"), State.initializeState("Egypt"), State.initializeState("Cyprus"), State.initializeState("Georgia"), State.initializeState("Greece"), State.initializeState("India"), State.initializeState("Indonesia"), State.initializeState("Iran"), State.initializeState("Iraq"), State.initializeState("Israel"), State.initializeState("Japan"), State.initializeState("Jordan"), State.initializeState("Kazakhstan"), State.initializeState("Kuwait"), State.initializeState("Kyrgyzstan"), State.initializeState("Laos"), State.initializeState("Lebanon", "Lubnan"), State.initializeState("Malaysia"), State.initializeState("Maldives"), State.initializeState("Mongolia"), State.initializeState("Myanmar", "Burma"), State.initializeState("Nepal"), State.initializeState("North Korea"), State.initializeState("Oman"), State.initializeState("Pakistan"), State.initializeState("Palestine"), State.initializeState("Philippines"), State.initializeState("Qatar"), State.initializeState("Russia"), State.initializeState("Saudi Arabia"), State.initializeState("Singapore"), State.initializeState("South Korea"), State.initializeState("Sri Lanka"), State.initializeState("Syria"), State.initializeState("Taiwan"), State.initializeState("Tajikistan"), State.initializeState("Thailand"), State.initializeState("Timor-Leste", "East Timor"), State.initializeState("Turkey"), State.initializeState("Turkmenistan"), State.initializeState("United Arab Emirates"), State.initializeState("Uzbekistan"), State.initializeState("Vietnam"), State.initializeState("Yemen"))); break;
			case "Europe": states = new ArrayList<>(List.of(State.initializeState("Albania"), State.initializeState("Andorra"), State.initializeState("Armenia"), State.initializeState("Austria"), State.initializeState("Azerbaijan"), State.initializeState("Belarus"), State.initializeState("Belgium"), State.initializeState("Bosnia and Herzegovina"), State.initializeState("Bulgaria"), State.initializeState("Croatia"), State.initializeState("Cyprus"), State.initializeState("Czechia"), State.initializeState("Denmark"), State.initializeState("Estonia"), State.initializeState("Finland"), State.initializeState("France"), State.initializeState("Georgia"), State.initializeState("Germany"), State.initializeState("Greece"), State.initializeState("Hungary"), State.initializeState("Iceland"), State.initializeState("Ireland"), State.initializeState("Italy"), State.initializeState("Kazakhstan"), State.initializeState("Kosovo"), State.initializeState("Latvia"), State.initializeState("Liechtenstein"), State.initializeState("Lithuania"), State.initializeState("Luxembourg"), State.initializeState("Malta"), State.initializeState("Moldova"), State.initializeState("Monaco"), State.initializeState("Montenegro"), State.initializeState("Netherlands"), State.initializeState("North Macedonia"), State.initializeState("Norway"), State.initializeState("Poland"), State.initializeState("Portugal"), State.initializeState("Romania"), State.initializeState("Russia"), State.initializeState("San Marino"), State.initializeState("Serbia"), State.initializeState("Slovakia"), State.initializeState("Slovenia"), State.initializeState("Spain"), State.initializeState("Sweden"), State.initializeState("Switzerland"), State.initializeState("Turkey"), State.initializeState("Ukraine"), State.initializeState("United Kingdom", "Britain", "UK", "United Kingdom of Great Britain and Northern Ireland"), State.initializeState("Vatican City"))); break;
			case "North America": states = new ArrayList<>(List.of(State.initializeState("Antigua and Barbuda"), State.initializeState("Bahamas"), State.initializeState("Barbados"), State.initializeState("Belize"), State.initializeState("Canada"), State.initializeState("Costa Rica"), State.initializeState("Cuba"), State.initializeState("Denmark"), State.initializeState("Dominica"), State.initializeState("Dominican Republic"), State.initializeState("El Salvador"), State.initializeState("Grenada"), State.initializeState("Guatemala"), State.initializeState("Haiti"), State.initializeState("Honduras"), State.initializeState("Jamaica"), State.initializeState("Mexico"), State.initializeState("Nicaragua"), State.initializeState("Panama"), State.initializeState("Saint Kitts and Nevis"), State.initializeState("Saint Lucia"), State.initializeState("Saint Vincent and the Grenadines"), State.initializeState("Trinidad and Tobago"), State.initializeState("United Kingdom"), State.initializeState("United States of America", "United States", "USA"))); break;
			case "Oceania": states = new ArrayList<>(List.of(State.initializeState("Chile"), State.initializeState("Fiji"), State.initializeState("France"), State.initializeState("Indonesia"), State.initializeState("Kiribati"), State.initializeState("Marshall Islands"), State.initializeState("Micronesia"), State.initializeState("Nauru"), State.initializeState("New Zealand"), State.initializeState("Palau"), State.initializeState("Papua New Guinea"), State.initializeState("Samoa"), State.initializeState("Solomon Islands"), State.initializeState("Tonga"), State.initializeState("Tuvalu"), State.initializeState("United Kingdom"), State.initializeState("United States of America"), State.initializeState("Vanuatu"))); break;
			case "South America": states = new ArrayList<>(List.of(State.initializeState("United Kingdom"), State.initializeState("Argentina"), State.initializeState("Bolivia"), State.initializeState("Brazil"), State.initializeState("Chile"), State.initializeState("Colombia"), State.initializeState("Ecuador"), State.initializeState("France"), State.initializeState("Guyana"), State.initializeState("Netherlands"), State.initializeState("Paraguay"), State.initializeState("Peru"), State.initializeState("Suriname"), State.initializeState("United Kingdom"), State.initializeState("Uruguay"), State.initializeState("Venezuela"))); break;
		}
		removeNamelessStates();
		removeDuplicatedStates();
		Collections.sort(states);
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private void removeNamelessStates() {
		for(int i = 0; i < states.size(); ++i)
			if(states.get(i).getName().hashCode() == "-nameless-".hashCode() &&
			states.get(i).getName().equals("-nameless-"))
				states.remove(states.get(i));
		}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private void removeDuplicatedStates() {
		for(int i = 0, j = i, n = states.size(); i < n - 1; j = ++i)
			while (++j < n)
				if(states.get(i).equals(states.get(j))) {
					states.remove(j);
					{--j; --n;}
				}
	}
	////////////////////////////////////////////////////////////////////////////
	static {addmultiLocatedStates();}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private static void addmultiLocatedStates() {
		for(int i = 0, k = - 1, n = values().length; i < n - 1; ++i, k = -1)
			while (++k < values()[i].states.size())
			{
				if(multiLocatedStates.containsKey(
						values()[i].states.get(k).getName()))
					continue;
				for(int j = i + 1, l = -1; j < n; ++j, l = -1)
					while(++l < values()[j].states.size())
						if(values()[i].states.get(k).equals(
								values()[j].states.get(l)))
							addMultiLocatedState(
									values()[i].states.get(k).getName(),
									values()[i].name, values()[j].name);
			}
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private static void addMultiLocatedState(
			final String stateName_key,
			final String continent1Name_value,
			final String continent2Name_value)
	{
		if(!multiLocatedStates.containsKey(stateName_key)){
		multiLocatedStates.put(stateName_key, new ArrayList<String>(7));
		multiLocatedStates.get(stateName_key).add(continent1Name_value);
		}
		multiLocatedStates.get(stateName_key).add(continent2Name_value);
	}
	////////////////////////////////////////////////////////////////////////////
	String getName() {return name;}
	List<State> getStates() {return states;}
	////////////////////////////////////////////////////////////////////////////
}