package _11_exceptions.pt2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ColorException extends IllegalArgumentException{
	private static final long serialVersionUID = 1L;
	public ColorException() {
		super("posiible colors of plants: " + Arrays.stream(Color.values()).map(Color::getName).collect(Collectors.joining('\n' + "\t".repeat(3) + "      ")));
	}
}