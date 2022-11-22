package day8;

public class Task1 {
    public static void main(String[] args) {
        runGlueStringWithStringBuilder();
        runGlueStringWithConcatenation();
    }

    static void runGlueStringWithStringBuilder() {
        long startTime = System.currentTimeMillis();
        for (Integer i = 0; i <= 20000; i++) {
            StringBuilder string = new StringBuilder(" ");
            System.out.print(string.append(i));
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("\n Длительность работы, в мс.: " + (stopTime - startTime));
    }

    static void runGlueStringWithConcatenation() {
        long startTime = System.currentTimeMillis();
        for (Integer i = 0; i <= 20000; i++) {
            String string = " ";
            System.out.print(i + " ");
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("\n Длительность работы, в мс.: " + (stopTime - startTime));
    }

}
