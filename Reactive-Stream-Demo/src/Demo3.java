import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", null, "Book", "Sky", null, null, "Chair");
        System.out.println(words);

        List<String> result = words.stream().filter(word -> word != null).collect(Collectors.toList());
        System.out.println(result);
    }
}
