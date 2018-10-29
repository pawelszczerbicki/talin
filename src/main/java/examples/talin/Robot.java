package examples.talin;

public class Robot {
    public static void main(String[] args) {
        char[] commands = {'m', 'l', 'p', 'p', 'p'};
        int armPosition = 0;
        int[] boxes = {0, 0, 0, 0, 0, 0, 0, 0};
        int maxArmPosition = 9;
        int maxPileSize = 10;

        for (char c : commands) {
            if (c == 'm') {
                armPosition++;
            }
            if (c == 'l') {

            }

            if (c == 'p') {
                armPosition = 0;
            }

        }

        for (int box : boxes) {
            System.out.println(box);
        }

    }
}
