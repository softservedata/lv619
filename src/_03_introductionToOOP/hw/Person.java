package _03_introductionToOOP.hw;

class Person {
	////////////////////////////////////////////////////////////////////////////
	private String firstName;
	private String lastName;
	private int birthYear;
	////////////////////////////////////////////////////////////////////////////
	Person(){}
	Person(String fn, String ln){
		if(fn != null && fn.length() > 1)
		firstName = fn;
		if(ln != null && ln.length() > 1)
		lastName = ln;
	}
	////////////////////////////////////////////////////////////////////////////
	String getFirstName() {return firstName;}
	String getLastName() {return lastName;}
	int getBirthYear() {return birthYear;}
	////////////////////////////////////////////////////////////////////////////
	int getAge() { return App.CURRENT_YEAR - birthYear; }
	////////////////////////////////////////////////////////////////////////////
	private String changeName(final String n) {
		boolean isCorrect;
		if(isCorrect = n != null && n.length() > 1)
		for(char ch: n.toCharArray())
			if(!Character.isLetter(ch)) {
				isCorrect = false;
				break;
			}
		return isCorrect ? n.substring(0, 1).toUpperCase() + 
				n.substring(1).toLowerCase() : null;
	}
	void changeName(String fn, String ln) {
		if(fn != null && !(fn = changeName(fn)).equals(null)) firstName = fn;
		if(ln != null && !(ln = changeName(ln)).equals(null)) lastName = ln;
	}
	////////////////////////////////////////////////////////////////////////////
	void input(String fn, String ln, int by) {
		firstName = fn;
		lastName = ln;
		birthYear = by;
	}
	////////////////////////////////////////////////////////////////////////////
	String output() { return this + "\tage - " + getAge(); }
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString(){
		return new StringBuilder()
				.append("\tfirst name - ").append(firstName)
				.append(new char[firstName.length() < 12 ? 12 - firstName.length() : 0])
				.append("\tlast name - ").append(lastName)
				.append(new char[lastName.length() < 12 ? 12 - lastName.length() : 0])
				.append("\tbirth year - ").append(birthYear).toString();
	}
	////////////////////////////////////////////////////////////////////////////
}