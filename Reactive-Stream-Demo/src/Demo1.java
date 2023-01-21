import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("without using stream...............................");

		ArrayList<Integer> numberss = new ArrayList<>();
		numberss.add(10);
		numberss.add(15);
		numberss.add(30);
		numberss.add(45);
		numberss.add(50);

		System.out.println(numberss);

		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
		System.out.println(numbers);

		List<Integer> evenNumbers = new ArrayList<>();



		// without using stream
		for(int number: numbers){
			if(number % 2 == 0){
				evenNumbers.add(number);
			}
		}

		System.out.println(evenNumbers);


		System.out.println("with using stream...............................");

		// with using stream
		evenNumbers = numbers.stream().filter((number) -> number % 2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);

		numbers.stream().filter(number -> number % 2==0).forEach(number -> System.out.println(number));
		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

	}
}
