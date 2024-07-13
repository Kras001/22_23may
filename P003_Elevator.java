package Week22_23may;

import java.util.Scanner;

public class P003_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil((double) people / capacityOfElevator);

        System.out.println(courses);


    }
}
