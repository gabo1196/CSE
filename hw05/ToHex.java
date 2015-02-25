// Gabriel Gaydos
// hw05

import java.util.Scanner;

public class ToHex {
    public static void main(String [ ] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter three numbers representing RGB values : ");
        int R = myScanner.nextInt();
        int G = myScanner.nextInt();
        int B = myScanner.nextInt();
        String str = Integer.toHexString(R);
        String str2 = Integer.toHexString(G);
        String str3 = Integer.toHexString(B);
        if (R > 255 || R < 0 || G > 255 || G < 0 || B > 255 || B < 0) {
            System.out.println("Sorry you must enter a value between 0-255");
        }
        else {
        System.out.println("The decimal numbers R:" + R +
        ", G:" + G + ", B:" + B + ", is represented in hexadecimal as: " + str + str2 + str3);
        }
    }
}