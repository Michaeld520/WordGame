import java.util.Scanner;

public class Turn {
    Scanner scanner = new Scanner(System.in);
    Numbers randomNumber = new Numbers();

    public boolean takeTurn(Player player, Host host ) {
        boolean guessCorrect = false;
        double number = Math.random();
        int rndPrize = (int)(number * 100+1);
        System.out.println(host.toString() + ": " + player.parentString() + ", Please guess a number between 1 and 100");
        int guess = scanner.nextInt();
        guessCorrect = randomNumber.compareNumbers(guess);
        if (rndPrize <= 50) {
            Money moneyPrize = new Money();
            int winnings = moneyPrize.displayWinnings(player, guessCorrect);
            if(winnings > 0){
                player.addMoney(winnings);
            } else player.reduceMoney(winnings);

            }else {
            Physical physicalPrize = new Physical();
            physicalPrize.displayWinnings(player,guessCorrect);
        }
        System.out.println(player.toString());
        return guessCorrect;
        }

        }



