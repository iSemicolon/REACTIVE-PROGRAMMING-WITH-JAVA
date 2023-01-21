import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mark", "Watson", "Paul", "Jeffry", "Stacy");
        List<String> nameLength = new ArrayList<>();

        nameLength = names.stream().filter(name -> name.length() > 4 && name.length() < 8).collect(Collectors.toList());
        System.out.println(nameLength);
    }
}
