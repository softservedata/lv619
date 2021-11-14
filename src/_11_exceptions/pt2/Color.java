package _11_exceptions.pt2;

public enum Color {
COLOR1("color1"), COLOR2("color2"), COLOR3("color3"), COLOR4("color4"), COLOR5("color5");
	String name;
	private Color(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}