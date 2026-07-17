import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapCollect {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Rahul", "Anjali", "Kiran", "Ramesh", "Sneha"
        );

        List<String> result = names.stream()
                .filter(name -> name.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}