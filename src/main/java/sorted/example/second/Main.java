package sorted.example.second;

import java.util.Arrays;
import java.util.List;

/*
Написать лист User (с полями: имя, возраст и зарплата):
1. получить лист, где User отсортированы  по зарплате в порядке возрастания
2. получить лист, где User отсортированы  по зарплате в порядке убывания
3. получить лист, где User отсортированы по именам
4. вывести через for лист, где User отсортированы по возрасту
5. получить лист, где User отсортированы по именам, а в случае, если имена одинаковые - по зп в порядке возрастания.

 */
public class Main {
    public static void main(String[] args) {
        List<User> userList = List.of(
                new User ("Masha", 45, 50_000),
                new User ("Katya", 32, 55_000),
                new User ("Dima", 55, 100_000),
                new User ("Katya", 20, 10_000)
        );

        userList.stream()
                .sorted((user1, user2) -> user1.getSalary().comp )

    }





}
