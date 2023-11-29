package sorted.ex.first;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
sorted
Написать лист чисел,  отсортировать в порядке убывания и вывести его через for.
Написать лист строк и отсортировать в порядке возрастания. Получить лист.
Написать массив чисел,  после отсортировать его и получить отсортированный массив.

Написать лист User (с полями: имя, возраст и зарплата):
1. получить лист, где User отсортированы  по зарплате в порядке возрастания
2. получить лист, где User отсортированы  по зарплате в порядке убывания
3. получить лист, где User отсортированы по именам
4. вывести через for лист, где User отсортированы по группам
5. получить лист, где User отсортированы по именам, а в случае, если имена одинаковые - по зп в порядке возрастания.


 */
public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(4, -1, 20, 15, 100, 95, 22, 12, 332, 3, 25);
        integerList.stream()
                .sorted(Comparator.reverseOrder()) //(firstInteger, secondInteger) -> secondInteger.compareTo(firstInteger)
                .forEach(e -> System.out.print(e + " "));

        System.out.println("\n");


        List<String> stringList = Arrays.asList("Cat", "Dog", "Bird", "Horse", "Lion");
        List<String> sortedStringList = stringList.stream()
                .sorted()
                .toList();

        System.out.println(sortedStringList);


        System.out.println("\n");


        int[] arr = {3232, 54, 63, 22, 90, 3, 111, 333, 0, -2, 45};
//        int[] sortedArr =
                Arrays.stream(arr)
                .sorted()
                .forEach(e-> System.out.print(e + " "));
//                .toArray();


//        Arrays.stream(sortedArr).forEach(e-> System.out.print(e + " "));




    }
}
