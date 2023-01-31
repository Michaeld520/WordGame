import java.util.Scanner;

public class GamePlay {
    static Person player;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = scanner.next();
        System.out.println("Would you like to enter a last name? Please enter Y for Yes or N for No");
        String lastName;

        boolean question = false;
        while (!question) {
            String lastNameQuestion = scanner.next().toUpperCase();
            if (lastNameQuestion.equals("Y")) {
                System.out.println("What is your last name?");
                lastName = scanner.next();
                Person player = new Person(firstName, lastName);
                question = true;
            } else if (lastNameQuestion.equals("N")) {
                Person player = new Person(firstName);
                question = true;
            } else {
                System.out.println("Incorrect input, please try again");
            }
        }
        Numbers randomNumber = new Numbers();
        randomNumber.generateNumber();
        boolean gameOver = false;
        while (!gameOver){
            System.out.println(Person.getFirstName(player) + ", Please guess a number between 1 and 100");
            int guess = scanner.nextInt();
        gameOver = randomNumber.compareNumbers(guess);

        }

    }
}
