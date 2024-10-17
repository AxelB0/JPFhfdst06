package be.vdab.JPFhfdst06;

import java.util.Arrays;

public class ArrayOefeningen {
    public static void main(String[] args) {
        int[] ints = new int[5];
        int random = (int) (Math.random() * 101);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(ints));
        int som = 0;
        for (int i : ints) {
            som += i;
        }

        System.out.println("De som is: " + som);
        System.out.println("Het gemiddelde is: " + (double) som / ints.length);

    }

}

