package day3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        switch(country) {
            case "Moscow" : 
            System.out.println("Russia");
            break;

            case "Rostov" : 
            System.out.println("Russia");
            break;

            case "Vladivostok" : 
            System.out.println("Russia");
            break;

            case "Rome" : 
            System.out.println("Italy");
            break;

            case "Milan" : 
            System.out.println("Italy");
            break;

            case "Liverpool" : 
            System.out.println("England");
            break;

            case "Manchester" : 
            System.out.println("England");
            break;

            case "London" : 
            System.out.println("England");
            break;

            case "Berlin" : 
            System.out.println("Germany");
            break;

            case "Munhen" : 
            System.out.println("Germany");
            break;

            case "Keln" : 
            System.out.println("Germany");
            break;

            case "Stop" :
            break;

            default : 
            System.out.println("Unknown country");
            break;
        }
    }
} 