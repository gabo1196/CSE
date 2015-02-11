// Gabriel Gaydos
// hw03

import java.util.Scanner;
import java.text.DecimalFormat;
public class Bicycle {
    public static void main(String [ ] args){
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter the number of counts : ");
        int nCounts = myScanner.nextInt();
        System.out.print("Enter the number of seconds : ");
        int nSecs = myScanner.nextInt();
        double Distance,
        Minutes,
        wheelDiameter = 27.0,
        PI = 3.14,
        feetPerMile = 5280,
        inchesPerFoot = 12,
        secondsPerMinute = 60,
        mph;
        double NumberCounts = (int) nCounts;
        
        Distance = NumberCounts * wheelDiameter * PI;
        Distance/= inchesPerFoot*feetPerMile;
        DecimalFormat df = new DecimalFormat("###.##");
        Minutes = (nSecs / secondsPerMinute);
        mph = Distance / (Minutes / 60);
        
        Distance*=100;
        int DistanceAsInt= (int) Distance;
        Distance=DistanceAsInt*.01;
       
        
        System.out.println("The distance was " + Distance + " miles and took " + Minutes + " minutes");
        System.out.println("The average mph was " + df.format(mph));
    }
}