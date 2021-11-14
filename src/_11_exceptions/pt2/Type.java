package _11_exceptions.pt2;

public enum Type {
	TYPE1("type1"), TYPE2("type2"), TYPE3("type3"), TYPE4("type4"), TYPE5("type5");
	String name;
	private Type(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}