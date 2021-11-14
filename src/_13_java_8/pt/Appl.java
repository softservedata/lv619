package _13_java_8.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Appl {

	private static void task6() {// TODO Write a method for sorting list of Strings using Java 8
		List<String> list = Stream.generate(__myLib.Rand::randLettersStringTitleCase).limit(5).toList();
		Supplier<Stream<String>> strStrmSpplr = () -> list.stream();
		System.out.println("6.\t\torigrn:\n" + strStrmSpplr.get().collect(Collectors.joining(", ")) + "\n\t\tsorted:\n"
				+ strStrmSpplr.get().sorted().collect(Collectors.joining(", ")));
	}

	private static void task5() {// TODO Show a date of first Monday for current month;
		System.out.println("5. first monday of current month: "
				+ LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY))
						.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
	}

	private static void task4() {// TODO Show which today is a day of a week
		System.out.println("4. today is " + LocalDate.now().getDayOfWeek().toString().toLowerCase());
	}
	////////////////////////////////////////////////////////////////////////////
	private static final Supplier<Stream<Integer>> intStrmSpplr;
	
	static { 
		int[] arr = new Random().ints(__myLib.Rand.randInt(5, 10), -100, 101).toArray();
		intStrmSpplr = () -> Arrays.stream(arr).boxed();
	}
	
	private static void task3() {// TODO Using Java 8 show the biggest number from n random numbers
		System.out.println("3. max: " + intStrmSpplr.get().max(Integer::compare).get());
	}

	private static void task2() {// TODO Print n random numbers on console using Java 8 in a sorted order
		System.out.println("2.\t\tsorted:\n"
				+ intStrmSpplr.get().sorted().map(i -> "" + i).collect(Collectors.joining(", ")));
	}

	private static void task1() {// TODO Print n random numbers on console using Java 8
		System.out.print("1.\t\torigin:\n" + intStrmSpplr.get().findFirst().get());
		intStrmSpplr.get().skip(1).forEach(i -> System.out.print(", " + i));
		System.out.println();
	}

	public static void main(String[] args) {
		task1();task2();task3();
		System.out.println("/".repeat(76));
		task4();task5();task6();
	}
	////////////////////////////////////////////////////////////////////////////
}