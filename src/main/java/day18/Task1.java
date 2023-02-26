package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        try {
            System.out.println(recursionSum(numbers, 0));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }

    public static int recursionSum(int[] numbers, int index) {
        if (index == numbers.length)
            return 0;

        return numbers[index] + recursionSum(numbers, index + 1);
    }
}
