package _11_exceptions.pt2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TypeException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;
	public TypeException() {
		super("posiible types of plants: " + Arrays.stream(Type.values()).map(Type::getName).collect(Collectors.joining('\n' + "\t".repeat(3) + "     ")));
	}
}