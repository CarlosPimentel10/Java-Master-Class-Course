public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        double number = 20.00;
        double secNumber = 80.00;
        double result = (number + secNumber) * 100.00;
        double remainder = result % 40.00;
        System.out.println("Result = " + result);
        boolean checkRemainder = remainder == 0 ? true : false;

        System.out.println("Remainder check " + checkRemainder);

        if(!checkRemainder){
            System.out.println("Got some remainder");
        }else {
            System.out.println("No remainder");
        }
    }
}