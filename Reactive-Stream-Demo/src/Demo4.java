import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {
    public static void main(String[] args) {
    	
    	System.out.println("Without Using Stream..............................");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers);

        //  without using stream
        List<Integer> finalList = new ArrayList<>();
        for(int number: numbers){
            int result = number * 5;
            finalList.add(result);
        }
        System.out.println(finalList);

        System.out.println("With Using Stream..............................");
        
        // with stream
        finalList = numbers.stream().map(number -> number * 5).collect(Collectors.toList());
        System.out.println(finalList);

        List<Integer> squateNumber = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(squateNumber);
    }
}
