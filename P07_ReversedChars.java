package Week22_23may;

import java.util.Scanner;

public class P07_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        char symbol3 = scanner.nextLine().charAt(0);

        String result = "";

        System.out.printf("%c %c %c",symbol3, symbol2, symbol1);

    }
}
