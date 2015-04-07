// Gabriel Gaydos
// hw10

import java.util.Scanner;
import java.util.Random;

public class RemoveElements{
    public static String listArray(int num[]){
	    String out="{";
	    for(int j=0;j<num.length;j++){
  	        if(j>0){
            	out+=", ";
  	        }
  	        out+=num[j];
	    }
	    out+="} ";
	    return out;
    }
    public static int[] randomInput() {
        int[] x =  new int[10];
        for (int i=0; i<x.length; i++) {
            x[i] = (int) (Math.random() * 10);
        }return x;
    }
    public static int[] delete(int[] list, int pos) {
        int[] list2 = new int[list.length-1];
        int x = 0;
        if (pos>=0 && pos<list2.length) {
            for(int i=0; i<list2.length; i++) {
                if (x == pos) {
                    x++;
                    i--;
                }
                else {
                    list2[i] = list[x];
                    x++;
                    }
                }return list2;
        }
        else {
        return list;
        }
    }
    public static int[] remove(int[] list, int target) {
        int count = 0;
        for(int i=0; i<list.length; i++){
            if(list[i]==target){
                count++;
            }
        }
        int[] list2 = new int[list.length - count];
        int x = 0;
        for(int j=0; j<list2.length; j++) {
            if (list[x] == target) {
                x++;
                j--;
            }
            else {
                list2[j] = list[x];
                x++;
            }
        }return list2;
    }
    public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	if (newArray1.length == num.length) {
  	    System.out.println("Invalid input, " + out);
  	}
  	else {
  	    System.out.println("Index " + index + " element is removed");
  	    String out1="The output array is ";
  	    out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out1);
  	}
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	if (newArray2.length == num.length) {
  	    System.out.println("Element " + target + " was not found");
  	    System.out.println(out);
  	}
  	else {
  	    System.out.println("Element" + target + " was found");
  	    String out2="The output array is ";
  	    out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out2);
  	}
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
}