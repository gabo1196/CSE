// Gabriel Gaydos
// hw07

import java.util.Scanner;

public class waves {
    public static void main(String [ ] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 30 inclusive: ");
        if(myScanner.hasNextInt()) {
            int x = myScanner.nextInt();
            String output;
            int t = 1;
            System.out.println("For Loop:");
            if(x >= 1 && x <= 30) {
                for (int i=1; i<x+1; i++) {
                    if(i%2 == 1) {
                       for (int y=i+1; y>1; y--) {
                            for (int z=y; z>1; z--) {
                                System.out.print("" + i);
                            }
                            System.out.println("");
                        }
                    }
                    else {
                        for (int c=1; c<i+1; c++) {
                            for (int v=1; v<c+1; v++) {
                                System.out.print("" + i);
                            }
                            System.out.println("");
                        }
                    }
                }
                System.out.println("While Loop");
                while (t <= x) {
                    output ="";
                    if(t%2 == 0) {
                        int s = 0;
                        while (s < t) {
                            output += t;
                            System.out.println(output);
                            s++;
                        }
                    }
                    else {
                        int s = t;
                        while (s > 0) {
                            int k = s;
                            while(k > 0) {
                                System.out.print(t);
                                k--;
                            }
                            System.out.println();
                            s--;
                        }
                    }
                    t = t+1;
                }
                System.out.println("Do-While Loop");
                t = 1;
                do {
                    output ="";
                    if(t%2 == 0) {
                        int s = 0;
                        do {
                            output += t;
                            System.out.println(output);
                            s++;
                        } while (s < t);
                    }
                    else {
                        int s = t;
                        do {
                            int k = s;
                            do {
                                System.out.print(t);
                                k--;
                            } while(k > 0);
                            System.out.println();
                            s--;
                        } while (s > 0);
                    }
                    t = t+1;
                } while (t <= x);
            }
            else if (x < 1 || x > 30) {
                System.out.println("Invalid input!");
            }
        }
    }
}