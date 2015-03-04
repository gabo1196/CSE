// Gabriel Gaydos
// lab 06
// In this lab we are printing out a number of smilely faces using while, for and do-while loops

import java.util.Random;
 
public class SmileGenerator {
    public static void main(String [ ] args) {
        //for (int i = 1; i < 6; i++) {
        //    System.out.print(":)");
        //
        //int count = 1;
        //}
        //while (count < 6) {
        //    System.out.print(":)");
        //    count++;
        //}
        //do {
        //    System.out.print(":)");
        //    count++;
        //} while (count < 6);
        int smiley = (int) (Math.random() * 100 + 1);
        while (smiley < 101) {
        System.out.print(":)");
        smiley++;
        if (smiley < 30) {
            System.out.print(":)");
            smiley++;
        //}
        }
    }
}
http://www.programmingsimplified.com/java/tutorial/java-for-loop