package _04_conditionStatementsFile.pt3;
import static __myLib.MyString.toTitleCase;
import static __myLib.MyString.trimForEachWordInName;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;;

class State implements Comparable<State>{
	////////////////////////////////////////////////////////////////////////////
	private String keyName;
	////////////////////////////////////////////////////////////////////////////
	private static final Map<String, Set<String>> multiNamedStates = 
			new TreeMap<>();
	////////////////////////////////////////////////////////////////////////////
	static State createState(String... names) throws Exception{
		if(names == null || names.length == 0)
			throw new IllegalArgumentException();
		for(int i = 0; i < names.length; ++i)
			names[i] = (trimForEachWordInName(names[i]));
		if(containsTwoOccupiedNames(names)) throw new Exception();
		return new State(names);
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	static State initializeState(String... names){
		if(names == null || names.length == 0)
			return new State("-nameless-");
		for(int i = 0; i < names.length; ++i)
			names[i] = (trimForEachWordInName(names[i])).toLowerCase();
		if(containsTwoOccupiedNames(names))
			return new State("-nameless-");		
		return new State(names);
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	private static boolean containsTwoOccupiedNames(String[] names) {
			boolean containsOneOccupiedName = false;
			for(String name: names)
				for(String key: multiNamedStates.keySet()) {
					if(name.hashCode() == key.hashCode() && name.equals(key)) {
						if(containsOneOccupiedName) return true;
						containsOneOccupiedName = true;
						continue;
						}
					for(String valEl: multiNamedStates.get(key))
						if(name.hashCode() == valEl.hashCode() &&
								name.equals(valEl))
						{
							if(containsOneOccupiedName) return true;
							containsOneOccupiedName = true;
							break;
						}
				}
			return false;
		}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private State(String... names) {
		Arrays.sort(names = namesInit(names));	
		if(names.length != 0) addNewStateNames(names);
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private String[] namesInit(String[] names) { //change
		for(int i = 0; i < names.length; ++i)
			for(String key: multiNamedStates.keySet()) {
				if(names[i].hashCode() == key.hashCode() &&
						names[i].equals(key))
				{
					keyName = names[i];
					names[i] = names[0];
					return Arrays.copyOfRange(names, 1, names.length);
				}
				for(String name: multiNamedStates.get(key))
					if(names[i].hashCode() == name.hashCode() &&
					names[i].equals(name))
					{
						keyName = key;
						return String.join(",", names).
								replace(key, "").replace(",,", ",").split(",");
					}
			}
		keyName = names[0];
		return Arrays.copyOfRange(names, 1, names.length);
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	private void addNewStateNames(final String[] names){
		if(multiNamedStates.containsKey(keyName))
			addStateNewNamesSorted(names); 
		else addNewMultiNamedState(names);
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private void addNewMultiNamedState(final String[] names){
		multiNamedStates.put(keyName, new TreeSet<>());
		multiNamedStates.get(keyName).addAll(Set.of(names));
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private void addStateNewNamesSorted(final String[] names){
		for(int i = 0; i < names.length; ++i)
			if(!multiNamedStates.get(keyName).contains(names[i])) {
				multiNamedStates.get(keyName).add(names[i]);
			}
	}
	////////////////////////////////////////////////////////////////////////////
	boolean containsName(String name) {
		return keyName.hashCode() == name.hashCode() && keyName.equals(name) ||
				multiNamedStates.containsKey(keyName) &&
				multiNamedStates.get(keyName).contains(name);
	}
	////////////////////////////////////////////////////////////////////////////
	String getName() {return keyName;}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public int hashCode() {
		return 31 + (keyName == null ? 0 : keyName.hashCode());
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass() &&
				hashCode() != obj.hashCode())
			return false;
		State other = (State) obj;
		if (keyName == null && other.keyName != null ||
				keyName != null && other.keyName == null)
			return false;
		if(keyName == null && other.keyName == null)
			return true;
		return keyName.equals(other.keyName);
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public int compareTo(State o) {
		return keyName.endsWith("congo") ?
				"congo".compareTo(o.getName()) : keyName.compareTo(o.getName()); 
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		if(!multiNamedStates.containsKey(keyName))
		return toTitleCase(keyName);
		StringBuilder additionalNames = new StringBuilder();
		for(String name: multiNamedStates.get(keyName))
			additionalNames.append(", " + 
				(name.hashCode() == "uk".hashCode() && name.equals("uk") || 
			name.hashCode() == "usa".hashCode() && name.equals("usa") ?
					name.toUpperCase() : toTitleCase(name)));
		return toTitleCase(keyName) +
				'(' + additionalNames.substring(2) + ')';
	}
	////////////////////////////////////////////////////////////////////////////
}