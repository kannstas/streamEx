package map.ex.firstEx;

import java.util.HashMap;
import java.util.Map;

/*
Создайте Map, содержащую информацию о количестве заказов в интернет-магазине по каждому месяцу.
Напишите метод, который принимает на вход Map с информацией о заказах и возвращает общую сумму заказов за заданный период времени.
 */
public class Main {
    public static void main(String[] args) {

        Map<String, Integer> ordersInYear = new HashMap<>();

        ordersInYear.put("January", 115);
        ordersInYear.put("February", 175);
        ordersInYear.put("March", 225);
        ordersInYear.put("April", 564);
        ordersInYear.put("May", 325);
        ordersInYear.put("June", 755);
        ordersInYear.put("July", 421);
        ordersInYear.put("August", 163);
        ordersInYear.put("September", 444);
        ordersInYear.put("October", 124);
        ordersInYear.put("November", 800);
        ordersInYear.put("December", 1067);

        printNumbersOfOrders(ordersInYear);


    }

    public static void printNumbersOfOrders (Map <String, Integer> map) {

       Integer result = map.values().stream()
               .mapToInt(Integer::intValue)
               .sum();
       System.out.println(result);

    }
}
