package map.ex.thirdEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

написать лист заполнить его названиями городов и улиц (улицы в нижнем ригистре)
через стрим получить лист где к каждому городу добавить city а улице добавить street
Character.isLowerCase() - подсказка

 */
public class Main {
    public static void main(String[] args) {

        List<String> cityList = Arrays.asList("калинингад", "ростов", "воронеж", "москва", "мурманск");


        //написать лист заполнить его названиями городов (города в нижнем ригистре)
        //через стрим получить лист где каждый город будет в верхнем регистре


        List<String> upperCaseCityList = cityList.stream()
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperCaseCityList);


        //написать лист заполнить его названиями городов (города в нижнем ригистре)
        //через стрим получить лист, где каждый город будет с большой буквы

        List<String> capitalizedCityList = cityList.stream()
                .map(cityName -> cityName.substring(0, 1).toUpperCase() + cityName.substring(1))
                .collect(Collectors.toList());

        System.out.println(capitalizedCityList);


        //  написать лист заполнить его названиями городов (города в нижнем ригистре)
        // через стрим получить лист, где к каждому городу будет добавленно слово City


        List<String> cityNameWithCityList = cityList.stream()
                .map(cityName -> cityName + " city")
                .collect(Collectors.toList());

        System.out.println(cityNameWithCityList);


        //    написать лист заполнить его названиями городов и улиц (улицы в нижнем ригистре)
        //   через стрим получить лист где к каждому городу добавить city а улице добавить street

               /*   List<String> cityAndStreetList = Arrays.asList("калинингад", "ленина", "комунаров", "Ростов", "белинского", "Воронеж", "Москва", "Мурманск", "9 января");

       List <Character> characterList = cityAndStreetList.stream()
               .map( c -> (char) + "street")
                       .collect(Collectors.toList());

               {  if (Character.isLowerCase(Integer.parseInt(element))) {
                return element + " street";
            } else {
                return element + " city";
            }
        }).collect(Collectors.toList());
  System.out.println(cityAndStreetWithAddWorldList);
                */


        // написать лист заполнить его названиями городов (города в нижнем ригистре)
        //  через стрим получить лист Integer, где будут длины названия этих городов

        List<Integer> cityNameLengthList = cityList.stream()
                .map(e -> e.length())
                .collect(Collectors.toList());

        System.out.println(cityNameLengthList);

    }
}
