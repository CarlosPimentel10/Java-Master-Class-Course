public class OverloadedMethods {
    public  static  double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 || inches > 12){
            return -1;
        }
        // 1 inch 2.54 cm
        // 1 feet 30.48 cm

        double totalCent = feet * 30.48;
        System.out.println(feet + " feet, " + inches + " inches = " + totalCent + " cm");
        return totalCent;
    }

    public  static  double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        // 1 inch 0.08333333 feet
        // 1 feet 30.48 cm
        double inchToFeet = inches * 0.08333333;
        double remainingInches = (int) inchToFeet % 12;
        System.out.println(inches + " inches is equal to " + inchToFeet + " feet and " + remainingInches + " remaining inches");
        return calcFeetAndInchesToCentimeters(inchToFeet, remainingInches);
    }

}
