package Week22_23may;

import java.util.Scanner;

public class P010_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaust = Integer.parseInt(scanner.nextLine());

        int startPower = power;


        int countPokes = 0;


        while (power >= distance){

            power -= distance;
            countPokes ++;
            if (power == startPower /2){
                if (exhaust != 0 ){

                    power = power / exhaust;


                }
            }
        }
        System.out.println(power);
        System.out.println(countPokes);


    }
}
