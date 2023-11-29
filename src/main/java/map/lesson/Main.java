package map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("Lily", "Ivan", "Georgia");

       /* Stream<String> stream1  =  list.stream().map(e -> e + e.length());
        stream1.forEach(e-> System.out.println(e + " "));
        */
        list = list.stream()
                .map(e->e+e.length())
                .collect(Collectors.toList());

        System.out.println(list);


        int [] arr = {1, 6, 8, 3, 2, 9};

       int [] arr2  = Arrays.stream(arr)
                .map(element -> {
                    if (element%3==0) {
                        return element / 3;
                    }else {
                        return element;
                    }
                }).toArray();

        System.out.println(Arrays.toString(arr2));


        Set<String> set = new HashSet<>(list);
        System.out.println(set);
       Set <Integer> integerSet =  set.stream()
                .map(element-> element.length())
                .collect(Collectors.toSet());
        System.out.println(integerSet);
    }
}
