import java.util.Arrays;

public class ArrayStreamExample {

	public static void main(String[] args) {

		int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer[] integerArray = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
		Arrays.stream(integerArray).forEach(System.out::println);

	}

}
