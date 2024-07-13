package Week22_23may;

import java.util.Scanner;

public class P011_SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBalls = Integer.parseInt(scanner.nextLine());
        double snowballMaxValue = 0;
        int maxSnowballSnow = 0 ;
        int maxSnowballTime = 0 ;
        int maxSnowballQuality = 0 ;




        for (int ball = 1; ball <= countBalls ; ball++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow( (double) snowballSnow / snowballTime , snowballQuality  );

            if (snowballValue > snowballMaxValue){
                snowballMaxValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }

            
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow,maxSnowballTime,snowballMaxValue,maxSnowballQuality);

    }
}
