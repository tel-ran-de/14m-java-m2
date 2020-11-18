package lesson11;

import java.util.Arrays;

public class ClassWork11 {
    public static void main(String[] args) {
    /*    System.out.println(Arrays.toString(fix45(5, 4, 9, 4, 9, 5)));//  → [9, 4, 5, 4, 5, 9]
        System.out.println(Arrays.toString(fix45(1, 4, 1, 5)));// → [1, 4, 5, 1]
        System.out.println(Arrays.toString(fix45(1, 4, 1, 5, 5, 4, 1)));// → [1, 4, 5, 1, 1, 4, 5]
    */
        System.out.println(Arrays.toString(squareUp(3)));// → [0, 0, 1, 0, 2, 1, 3, 2, 1]
        System.out.println(Arrays.toString(squareUp(2)));// → [0, 1, 2, 1]
        System.out.println(Arrays.toString(squareUp(4)));// → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

    }

    private static int[] squareUp(int n) {
        int[] output = new int[n * n];
        if (n == 0) return output;
        for (int i = n - 1; i < output.length; i += n) {
            for (int j = i; j >= i - (i / n); j--) {
                output[j] = i - j + 1;
            }
        }
        return output;
    }

    private static int[] fix45(int... args) {
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 4) {
                for (int j = index; j < args.length; j++) {
                    if (args[j] == 5) {
                        int temp = args[i + 1];
                        args[i + 1] = args[j];
                        args[j] = temp;
                        // index = (i + 1 > j ? i + 2 : j);
                        if (i + 1 > j) {
                            index = i + 2;
                        } else index = j;
                        break;
                    }
                }
            }
        }
        return args;
    }
}
