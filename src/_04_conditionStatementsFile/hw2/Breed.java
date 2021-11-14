package _04_conditionStatementsFile.hw2;

enum Breed {
	BREED1, BREED2, BREED3;
	@Override
	public String toString(){
		return name().charAt(0) + name().substring(1).toLowerCase();
	}
}