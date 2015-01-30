// Gabriel Gaydos
// 1/30/15
// CSE 2

public class Cyclometer {
    public static void main(String [ ] args){
        int Trip1sec = 480; //
        int Trip2sec = 3220; //
        int Trip1count = 1561; //
        int Trip2count = 9037; //
        double wheelDiameter = 27.0, //
        PI = 3.14, //
        feetPerMile = 5280, //
        inchesPerFoot = 12, //
        secondsPerMinute = 60; //
        double Trip1Distance, Trip2Distance, totalDistance; //
        System.out.println("Trip1 took " + 
        (Trip1sec/secondsPerMinute) + " minutes and had " +
        Trip1count + " counts");
        System.out.println("Trip2 took " + 
        (Trip2sec/secondsPerMinute) + " minutes and had " +
        Trip2count + " counts");
        Trip1Distance = Trip1count * wheelDiameter * PI;
        // above gives the distance in inches
        // (for each count, a rotation of the wheel travels
        // the diameter in inches times PI)
        Trip1Distance/= inchesPerFoot * feetPerMile; // converts to distance in miles
        Trip2Distance = Trip2count * wheelDiameter * PI / inchesPerFoot / feetPerMile;
        totalDistance = Trip1Distance + Trip2Distance;
        System.out.println("Trip1 was " + Trip1Distance + " miles");
        System.out.println("Trip2 was " + Trip2Distance + " miles");
        System.out.println("The total distance was " + totalDistance + "miles");
    }
}