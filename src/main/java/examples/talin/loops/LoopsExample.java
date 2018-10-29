package examples.talin.loops;

public class LoopsExample {

    int some = 22;

    public static void main(String[] args) {
        int amountOfIteration = 20;

        int some = 32;

        System.out.println(some);

        while (amountOfIteration > 0) {
            amountOfIteration = amountOfIteration - 1;
            System.out.println("hello");
        }

        String[] letters = {"A", "b", "d", ""};

        int i = 0;
        int sizeOfArray = letters.length;

        do {
            String letter = letters[i];
            System.out.println(letter);
            // System.out.println(letters[i]);  other way
            //i= i+1; its equal to i++
            i++;
        } while (i < sizeOfArray);

        for (int j = 0; j < 20; j++) {
            System.out.println(j);
        }

        //display all elements from `letters` array using for loop
        for (int j = 0; j < letters.length; j++) {
            System.out.println(letters[j]);
        }

        //prints new line
        System.out.println();

        //printing without new line
        System.out.print("");
        System.out.println("\n \tTODO display letter \" and index of letter (position)");

        for (int j = 0; j < letters.length; j++)
            System.out.println(j + letters[j]);

        System.out.println("finish");
    }
}