package day4;

import java.util.Arrays;
import java.util.Random;

import javax.lang.model.element.Element;

public class task2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int [] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int min = 10000;
        int max = 0;

        for (int x : array) {
            if(x < min) {
                min = x;
            }

            if(x > max) {
                max = x;
            }
        }
        System.out.println(min);
        System.out.println(max);

        int counter = 0;
        for (int value : array) {
            if(value % 10 == 0) {
                counter++;
            }
        }

        System.out.println(counter);

        int sumOfValue = 0;
        for (int value : array) {
            if(value % 10 == 0) {
                sumOfValue += value ;
            }
        }

        System.out.println(sumOfValue);
    }
    
}
