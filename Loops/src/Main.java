import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10.000,00 at " + i + "% interest = " + String.format("%.2f", calculateInterestRate(10000, i)));
//
//        }
        //isPrime(19);
        //System.out.println(sum(15));

        System.out.println(SumOddRange.sumOdd(10,5));
    }
    public static int sum(int n){
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            sum = i;
            if(i % 3 == 0 && i % 5 == 0){
                count++;
                System.out.println("there are " + count + " primes");
                return sum += i;
            }

        }
        return sum;
    }

    public static double calculateInterestRate(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

//    public static boolean isPrime(int n) {
//        int count = 0;
//        if (n == 1) {
//            return false;
//        }
//        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//            count++;
//            System.out.println(count + i + " is prime ");
//            if(count == 3){
//                break;
//            }
//        }
//        System.out.println(n + " is a prime number");
//        return true;
//    }
}