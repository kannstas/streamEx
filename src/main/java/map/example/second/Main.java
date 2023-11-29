package map.ex.secondEx;
/*
Напишите метод, который принимает на вход Map с информацией
о посещениях сайта и возвращает список страниц, которые были посещены более 100 раз.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> visitWebsite = new HashMap<>();

        visitWebsite.put("Cosmopolitan", 109);
        visitWebsite.put("Fire", 99);
        visitWebsite.put("Cats", 50);
        visitWebsite.put("PopMusic", 123);
        visitWebsite.put("Garden", 230);
        visitWebsite.put("Useful items", 890);
        visitWebsite.put("Lifehacks", 92);
        visitWebsite.put("Children", 212);
        visitWebsite.put("Beauty", 70);
        visitWebsite.put("Hair", 60);
        visitWebsite.put("Shoes", 500);
        visitWebsite.put("Fastfood", 900);

        List<Integer> webSitesList = visitWebsite.values()
                .stream()
                .filter(e -> e>=100).toList();

        System.out.println(webSitesList);

    }
    public static void printNumberOfVisit (Map<String, Integer> map) {


    }
}
