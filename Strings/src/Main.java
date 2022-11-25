public class Main {
    public static void main(String[] args) {
//        //System.out.println("Hello world!");
//        String myStr = "This is a string";
//        myStr = myStr +" \u00A9";
//        System.out.println(myStr + ", more of text.");
        int result = 14 + 89;
        System.out.println(result /= 2);
        boolean isAlien = false;

        if (isAlien != false) {
            System.out.println("Is not an alien");
        } else {
            System.out.println("And I am not scared of aliens");
        }

        int topScore = 100;
        int secondTopScore = 60;
        if(topScore == 100 && secondTopScore < 50){
            System.out.println("You got the high score");
        }
        else {
            System.out.println("Second great score is bigger than 50");
        }

        boolean isCar = false;

        if(isCar){
            System.out.println("Car exists");
        }

//        boolean wasCar = isCar ? false : true;
//        System.out.println("Was car "+ true);
        int age = 20;

        boolean canDrive = age < 18 ? false : true;
        System.out.println("Can drive = " + canDrive);
    }
}