package for_each;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] array = {1, -2, 45, 22, -28, 33};
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));

        System.out.println();

        Arrays.stream(array).forEach(e -> {
            e *= 2;
            System.out.print(e + " ");
        });
        System.out.println();


      //  Arrays.stream(array).forEach(new Util()::printAbsoluteNumber);
        Arrays.stream(array).forEach(new Util()::returnNumber);

    }
}

class Util {
    public void printAbsoluteNumber(int a) {
        if (a < 0) {
            System.out.print((a * -1) + " ");
        } else {
            System.out.print(a + " ");
        }

    }


    public void returnNumber(int a) {
        if (a < 0) {
            System.out.print(a + " ");
        } else {
            System.out.print((a * -1) + " ");
        }
    }
}

