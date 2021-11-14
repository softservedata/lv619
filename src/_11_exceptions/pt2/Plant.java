package _11_exceptions.pt2;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Plant {
	private int size;
	private Color color;
	private Type type;
	Plant(int size, String color, String type) throws IllegalArgumentException{
		if(size < 1)
			throw new IllegalArgumentException("size < 1");
		if(!Arrays.stream(Color.values()).map(Color::getName).collect(Collectors.joining("")).contains(color))
			throw new ColorException();
		if(!Arrays.stream(Type.values()).map(Type::getName).collect(Collectors.joining("")).contains(type))
			throw new TypeException();
		this.size = size;
		this.color = Color.valueOf(color.toUpperCase());
		this.type = Type.valueOf(type.toUpperCase());
	}
	@Override
	public String toString() {
		return "size:  " + size + "\tcolor:  " + color.getName() + "\ttype:  " + type.getName();
	}
}