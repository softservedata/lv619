package _04_conditionStatementsFile.pt3;

final class StateLocater {
	////////////////////////////////////////////////////////////////////////////
	private String stateName;
	private String location;
	private static final StateLocater instance = new StateLocater();
	////////////////////////////////////////////////////////////////////////////
	public static String getStateLocation(final String input) {
		instance.stateName = instance.location = "";
		return instance.locateState(input);
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private String locateState(final String input) {
		for(Continent continent: Continent.values())
			for(State state: continent.getStates())
				if(state.containsName(input)){
					instance.stateName = state.toString();
/*Sorry...*/		instance.location = Continent.multiLocatedStates.containsKey(state.getName()) ? (instance.location = Continent.multiLocatedStates.get(state.getName()).toString().replace("[", "").replace("]", "")).substring(0, location.lastIndexOf(',')) + " and" + instance.location.substring(instance.location.lastIndexOf(',') + 1) : continent.getName();
					break;
				}
		return instance.stateName.isEmpty() ? "state not found" :
			instance.stateName + " is located in " + instance.location;
	}
	////////////////////////////////////////////////////////////////////////////
}