import java.util.Scanner;

public class GamePlay {

    public static void main(String[] args) {
        Host host = new Host("Bob", "Barker");
        host.randomizeNum();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scanner.next();
        System.out.println("Would you like to enter a last name? Please enter Y for Yes or N for No");
        String lastName;
        Player player = null;
        boolean question = false;
        while (!question) {
            String lastNameQuestion = scanner.next().toUpperCase();
            if (lastNameQuestion.equals("Y")) {
                System.out.println("What is your last name?");
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
        boolean continueGame = true;

        while (continueGame) {
            Turn takeTurn = new Turn();
            boolean gameOver = false;
            while (!gameOver) {
                gameOver = takeTurn.takeTurn(player, host);
            }

            boolean correctAnswer = false;
            while (!correctAnswer) {
                System.out.println("Would you like to continue playing? Please enter Y for Yes or N for No");
                String continueGameQuestion = scanner.next().toUpperCase();
                if (continueGameQuestion.equals("Y")) {
                    continueGame = true;
                    correctAnswer = true;
                } else if (continueGameQuestion.equals("N")) {
                    System.out.println(host.toString() + ": Thank you for playing, " + player.parentString());
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

