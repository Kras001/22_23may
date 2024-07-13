package Week22_23may;

import java.util.Scanner;

public class P002_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (num > 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10 ;

        }
        System.out.println(sum);
    }
}
