package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {

    List<Dish> specialMenu = Arrays.asList(
            new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fires", true, 530, Dish.Type.OTHER)
    );

    List<Dish> filteredMenu = specialMenu.stream().filter(d->d.getCalories() < 320)
            .collect(Collectors.toList());

}
