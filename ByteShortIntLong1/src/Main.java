public class Main {
    public static void main(String[] args) {

        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;

//        System.out.println("my min integer value " + myMinInt);
//        System.out.println("my max integer value " + myMaxInt);
//        System.out.println("Busted max integer value " + (myMaxInt + 1));

        byte myMinByte = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        long myLong = Long.MIN_VALUE;
        short myShort = Short.MIN_VALUE;

//        System.out.println("My min byte value " + myMinByte);
//        System.out.println("My max byte value " + maxByteValue);
//        System.out.println("My long value " + myLong);
//        System.out.println("my short " + myShort);

        byte myNewByte = (byte)(myMinByte / 2);
//        System.out.println("new byte " + myNewByte);
        // Challenge of numbers
        byte myByteChal = 120;
        short myShortChal = 1456;
        int myIntChal = 4575;
        long myLongChal = 50000L+ 10L * (myByteChal + myShortChal + myIntChal);

        System.out.println("My long challenge result " + myLongChal);
    }
}