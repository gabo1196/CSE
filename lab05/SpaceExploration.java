// Gabriel Gaydos
// 2/20/15

import java.util.Random;

public class SpaceExploration {
    public static void main(String [ ] args) {
        int nYear = (int) (Math.random() * 11) + 2000;
        System.out.println("The year you are in is : " + nYear);
        String str="";
        str = str.toUpperCase();
        char input = str.charAt(0);
    
        switch (input) {
            case 2010 :
                System.out.println("SpaceX successfully sends spacecraft to orbit and back");
                
            case 2009 :
                System.out.println("NA");
                
            case 2008 :
                System.out.println("Kepler launched to study deep space");
                
            case 2007 :
                System.out.println("NA");
                
            case 2006 :
                System.out.println("Scapecraft returns with collections from a comet");
                
            case 2005 :
                System.out.println("Scapecraft collies with comet");
                
            case 2004:
                System.out.println("NA");
                
            case 2003:
                System.out.println("Largest infrared telescope released");
                
            case 2002:
                System.out.println("NA");
                
            case 2001:
                System.out.println("First spacecraft lands on an astroid");
                
            case 2000:
                System.out.println("First spacecraft orbits an atroid");
                break;
        }
    }
}