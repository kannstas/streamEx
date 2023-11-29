package forEach.example.first;

import java.util.Arrays;
import java.util.List;

/*
for
Написать лист городов. Вывести каждый город, к которому добавить "билет в (далее название города)".

Написать лист User (cо свойствами: имя, возраст, группа).Вывести всех юзеров (их свойства).
 */
public class Main {
    public static void main(String[] args) {
        List<String> cityList = Arrays.asList("Калинингад", "Ростов", "Воронеж", "Москва", "Мурманск");

        cityList.stream().forEach(e-> System.out.println( "билет в " + e));

        System.out.println();


       List <User> userList = Arrays.asList(new User("Masha", 19, 1),
               new User("Fedor", 20, 3));

       userList.stream().forEach(e-> System.out.println(e));

    }
}
