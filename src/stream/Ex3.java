package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Ex3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");

        List<String> uniqueCharacters = words.stream().map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

//        System.out.println(uniqueCharacters);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream().map(n-> n*n).collect(toList());
//        System.out.println(squares);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3,4);

        List<int[]> pairs = numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[]{i,j})).collect(toList());

//        for (int[] pair : pairs) {
//            System.out.println(Arrays.toString(pair));
//        }

        List<int[]> pairs2 = numbers1.stream().flatMap(i -> numbers2.stream().filter(j -> (i+j) %3 == 0).map(j -> new int[]{i,j})).collect(toList());

        for (int[] ints : pairs2) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
