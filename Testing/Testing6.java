import java.util.Scanner;

public class Testing6 {
    public static int sumsq (int n) {
        int total = 0;
        for (int i=1; i<=n; i++) {
            int prod = i*i;
            total = total + prod;
        }
        return total;
    }
    public static void main( String args[] ){
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        boolean check = true;
        do {
            System.out.print("Enter an int- ");
	        int n = myScanner.nextInt();
	        if (n <= 0) {
	            System.exit(0);
	        }
	        else {
	        sumsq(n);
	        sum = sumsq(n);
	        System.out.println("1+2*2+3*3+...+n*n = " + sum);
	        }
        } while (check);
    }
}