package Week22_23may;

import java.util.Scanner;

public class P04_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)   ;

        String town = scanner.nextLine();
        long population =Long.parseLong(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", town , population, area);

        

    }
}
