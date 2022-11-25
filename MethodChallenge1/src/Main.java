public class Main {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Michael", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Bob", position);

        position = calculateHighScorePosition(300);
        displayHighScorePosition("Mike", position);


    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " Managed to get into position " + position + " On the highScore table");

    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }
}