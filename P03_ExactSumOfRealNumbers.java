package Week22_23may;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= countNumbers ; i++) {

            BigDecimal currentNumber = new BigDecimal(scanner.nextLine());

            sum =  sum.add(currentNumber);

        }
        System.out.println(sum);


    }
}
