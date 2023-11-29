package first_project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //получение стрима из листа
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> integerStream = list.stream();
        integerStream.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // получение стрима из строки
        String text = "Aazaza";
        IntStream intStream2 = text.chars();
        intStream2.forEach(e -> System.out.print(e + " "));

        System.out.println();

        // получение стрима из массива
        int[] array = {1, 4, 56, 33};
        IntStream intStreamArray = Arrays.stream(array);

        Integer[] array2 = {1, 4, 56, 33};
        Stream<Integer> intStreamArray2 = Arrays.stream(array2);

        String[] arrayString = {"fsfsd", "dwfew", "rwerwr"};
        Stream<String> stringArrayStream = Arrays.stream(arrayString);
        stringArrayStream.forEach(e -> System.out.println(e + " "));


        // создать стрим из значений

        Stream<Integer> integerStream3 = Stream.of(2, 4, 3, 12);
        Stream<String> stringStream4 = Stream.of("axax", "oxoxox");
        stringStream4.forEach(e -> System.out.println(e + " "));


        // получить стрим из файла
        Path path = Paths.get("/Users/itprofil/Downloads/StreamEx/src/main/java/first_project/names.txt");
        try {
            Stream<String> stringStreamFile = Files.lines(path);
            stringStreamFile
                    .filter(name -> name.startsWith("L"))
                    .forEach(e -> System.out.println(e + " "));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
