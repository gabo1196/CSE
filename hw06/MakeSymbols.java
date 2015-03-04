// Gabriel Gaydos
// hw06 

import java.util.Random;

public class MakeSymbols { 
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100 + 1);
        int hippo = x; 
        System.out.println("Random number generated: " + x);
        do {
            if(x%2 == 0) {
                System.out.print("*");
                hippo--;
            }
            else {
                System.out.print("&");
                hippo--;
            }
        }while(hippo>0);
    }
}