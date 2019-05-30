package pl.grzegorz;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        long sample = 12345;
        long sample2 = sample;
        int counter = 0;

        do {
            counter++;
            sample = sample / 10;
        } while (sample > 0);

        System.out.println(counter);
        long[] tab = new long[counter];


        for (int i = 0; i < tab.length; i++) {
            tab[i] = sample2 % 10;
            sample2 = sample2 / 10;
        }

        System.out.println(Arrays.toString(tab));


    }
}
