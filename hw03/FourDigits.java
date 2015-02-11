// Gabriel Gaydos
// hw03

import java.util.Scanner;

public class FourDigits {
    public static void main(String [ ] args) {
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter a double : ");
        double nfourDigits = myScanner.nextDouble();
        double x = nfourDigits*10000;
        int nFirst = (int) nfourDigits;
        double z = nfourDigits*10000;
        double y = x%10000;
        System.out.println("The four digits are "+y+" ");
    }
}