public class Main {
    public static void main(String[] args) {

        // calculateScore(true, 4000, 5,100);
        int highScore = calculateScore(true, 4000, 5,100);
        System.out.println("Your highest score was = " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus ){
        int finalScore = 0;
          if(gameOver){
              finalScore = score + (levelCompleted * bonus);
              finalScore += 2000;
            //System.out.println("Your final score was = " + finalScore);
           return finalScore;
        }
          return -1; // indicates error

    }
}