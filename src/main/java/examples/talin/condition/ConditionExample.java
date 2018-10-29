package examples.talin.condition;

public class ConditionExample {
    public static void main(String[] args) {
        //this data is from user
        int first = 30;
        int second = 4;

        if (first > second) {
            System.out.println(first + " digit is bigger than " + second);
        } else if (first < second) {
            System.out.println(first + " digit is lower than " + second);
        } else if (first == second) {
            System.out.println(first + " and " + second + " are equal");
        } else {
            System.out.println("Math does not work");
        }


        int max = 1230;

        System.out.println("//todo display all even numbers from zero to number provided in variable");
        System.out.println("First solution");
        for (int i = 0; i < max; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        System.out.println("Second solution");
        for (int i = 0; i < max; i = i + 2) {
            System.out.println(i);
        }

        int[] numbers = {1, 34, 12, 45};

        //TODO display even numbers from array

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && i % 2 == 1)
                System.out.println(numbers[i]);
        }
        //TODO display even numbers from array in odd positions

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            System.out.println(currentNumber);
        }

        int x = 2;
        for (int dsadas : numbers) {
            System.out.println(dsadas);
        }
    }
}
