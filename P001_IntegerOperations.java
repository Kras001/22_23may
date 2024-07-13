package Week22_23may;

import java.util.Scanner;

public class P001_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        int sumNumber = num1 + num2;
        int devideNumber = sumNumber / num3;
        int multiNumber = devideNumber * num4;

        System.out.println(multiNumber);
    }
}
