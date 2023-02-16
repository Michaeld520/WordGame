import java.util.Scanner;

public class GamePlay {

    public static void main(String[] args) {
        Host host = new Host("Bob", "Barker");
        host.randomizeNum();
        Player[] players = new Player[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("First name of Player " + i + "?");
            String firstName = scanner.next();
            System.out.println("Would you like to enter a last name for this player? Please enter Y for Yes or N for No");
            String lastName;
            Player player = null;
            boolean question = false;
            while (!question) {
                String lastNameQuestion = scanner.next().toUpperCase();
                if (lastNameQuestion.equals("Y")) {
                    System.out.println("What is the last name of the player?");
                    lastName = scanner.next();
                    player = new Player(firstName, lastName);
                    question = true;
                } else if (lastNameQuestion.equals("N")) {
                    player = new Player(firstName);
                    question = true;
                } else {
                    System.out.println("Incorrect input, please try again");
                }
            }
            players[i - 1] = player;
        }
        boolean continueGame = true;

        while (continueGame) {

            Turn takeTurn = new Turn();
            boolean gameOver = false;
            int i = 0;
            while(!gameOver) {

                gameOver = takeTurn.takeTurn(players[i], host);
                i++;
                if (i == 3 && !gameOver) {
                    i = 0;
                }
            }



        boolean correctAnswer = false;
        while (!correctAnswer) {
            System.out.println("Would you like to continue playing? Please enter Y for Yes or N for No");
            String continueGameQuestion = scanner.next().toUpperCase();
            if (continueGameQuestion.equals("Y")) {
                continueGame = true;
                correctAnswer = true;
            } else if (continueGameQuestion.equals("N")) {
                System.out.println(host.toString() + ": Thank you for playing!");
                continueGame = false;
                correctAnswer = true;
            } else {
                System.out.println("Incorrect input, please try again");
                correctAnswer = false;
            }
        }
        }
    }
}



