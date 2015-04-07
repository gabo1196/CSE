import java.util.Scanner;

public class Testing5 {
    public static int sumPow (int n) {
        int prod = 1;
        int total = 0;
        if (n <= 0) {
            return 0;
        }
        else {
            for (int i=1; i<=n; i++) {
                prod = i;
                for (int j=1; j<i; j++) {
                    prod = prod*i;
                }
                total = total + prod;
            }
        }
        return total;
    }
    public static void main( String args[] ){
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        boolean check = true;
        while (check) {
            System.out.print("Enter an int- ");
	        int n = myScanner.nextInt();
	        sumPow(n);
	        sum = sumPow(n);
	        System.out.println("1+2*2+3*3*3+...+n*n*n...n = " + sum);
	        break;
        }
    }
}