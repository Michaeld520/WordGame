import java.util.Scanner;

public class Turn {
    private int incorrectGuess = 200;

    private int correctGuess = 1000;
    Scanner scanner = new Scanner(System.in);
    Numbers randomNumber = new Numbers();

    public boolean takeTurn(Player player, Host host ) {
        boolean guessCorrect;
            System.out.println(host.toString() + ": " + player.parentString() + ", Please guess a number between 1 and 100");
            int guess = scanner.nextInt();
            guessCorrect = randomNumber.compareNumbers(guess);
            if (guessCorrect){
                System.out.println(player.parentString() + ", you won $" + correctGuess + "!");
                player.addMoney(correctGuess);
                System.out.println(player.toString());
        } else {
                System.out.println(player.parentString() + ", you lose $" + incorrectGuess);
                player.reduceMoney(incorrectGuess);
                System.out.println(player.toString());
            }
        return guessCorrect;
    }
}
