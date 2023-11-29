package sorted;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-91, 92, 33, -17, 13, 0, -1);

        list = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list);

        int []  result = {1,34,5,456,5,7};

        result = Arrays.stream(result)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(result));


        List <User> listUsers = Arrays.asList(new User("Lena", 16),
                new User("Lesha", 23), new  User ("Asha", 45));

       /*
        listUsers = listUsers.stream()

                .sorted((e1,e2)->Integer.compare(e1.age,e2.age))
                .collect(Collectors.toList());

        */


        listUsers = listUsers.stream()
                .sorted((e1,e2)-> e1.name.compareTo(e2.name))
                .collect(Collectors.toList());
        System.out.println(listUsers);

        Collections.sort(listUsers,(e1, e2)-> e2.name.compareTo(e1.name));// сортировка через collections

        System.out.println(listUsers);


        List <Integer> integerList = Arrays.asList(4, 3,5,4, 23, 45, 64, 56);
        int sum = integerList.stream()
                .filter(e-> e % 2 != 0)
                .reduce((a, e)-> a+e)
                .get();

        System.out.println(sum);


        List<Integer> integerList2 = integerList.stream()
                        .filter(e-> e % 2 == 0)
                       .sorted((e1, e2) -> Integer.compare(e2, e1))
                       .collect(Collectors.toList());

        System.out.println(integerList2);
    }
}
