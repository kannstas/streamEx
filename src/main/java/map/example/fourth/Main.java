package map.ex.fourthExFilterAndMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

filter and map

написать лист User(у которых есть имя, возраст и зп)
отфильтровать, где есть только те User, зп которых выше 50_000 и возраст меньше 20.
После каждому User уменьшить зп на 10_000. Получить лист
 */
public class Main {
    public static void main(String[] args) {
        List<User> userList = Arrays.asList(new User("Masha", 33, 45_000),
                new User("Lena", 24, 70_000),
                new User("Alex", 50, 200_000),
                new User("Kristina", 19, 55_000));

        List<User> filteredUserList = userList.stream()
                .filter(user -> user.getSalary() > 50_000)
                .filter(user -> user.getAge() < 20)
                .map(user -> user.decreaseSalary(10_000d))
                .collect(Collectors.toList());

        // filteredUserList.forEach(e-> System.out.println(e));

        System.out.println(filteredUserList);

    }
}


