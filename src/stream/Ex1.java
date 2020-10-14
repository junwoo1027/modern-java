package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static stream.Dish.Type.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, MEAT),
                new Dish("beef", false, 700, MEAT),
                new Dish("chicken", false, 400, MEAT),
                new Dish("french fries", true, 530, OTHER),
                new Dish("rice", true, 350, OTHER),
                new Dish("season fruit", true, 120, OTHER),
                new Dish("pizza", true, 550, OTHER),
                new Dish("prawns", false, 300, FISH),
                new Dish("salmon", false, 450, FISH)
        );

//        List<String> threeHighCaloricDishNames =
//                menu.stream().filter(dish -> dish.getCalories() > 300)
//                .map(Dish::getName)
//                .limit(3)
//                .collect(Collectors.toList());
//
//        System.out.println(threeHighCaloricDishNames);
//
//        List<String> names = menu.stream().map(Dish::getName).collect(Collectors.toList());
//        System.out.println(names);
//
//        List<String> highCaloricDishNames =
//                menu.stream().filter(dish -> dish.getCalories() > 300)
//                .map(Dish::getName).collect(Collectors.toList());

        List<String> names2 =
                menu.stream().filter(dish -> {
                    System.out.println("filtering:" + dish.getName());
                    return dish.getCalories() > 300;
                })
                .map(dish -> {
                    System.out.println("mapping:" + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(Collectors.toList());

//        System.out.println(names2);
    }
}
