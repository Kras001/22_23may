package Week22_23may;

import java.util.Scanner;

public class P007_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int tankLitters = 0 ;

        for (int pour = 1; pour <=count ; pour++) {

            int puredLiters = Integer.parseInt(scanner.nextLine());

            tankLitters += puredLiters;

            if (tankLitters > 255){
                System.out.println("Insufficient capacity!");
                tankLitters -= puredLiters;
            }



        }
        System.out.println(tankLitters);
    }
}
