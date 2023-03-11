import java.util.Scanner;

public class Turn {


    Scanner scanner = new Scanner(System.in);


    public boolean takeTurn(Player player, Host host ) {
        boolean guessCorrect = false;
       int rndPrize = (int)(Math.random() * 100+1);
        System.out.println(host.toString() + ": " + player.parentString() + ", Please enter a letter");
        String guess = scanner.nextLine();
        try
        {
            guessCorrect = Phrases.findLetters(guess);
        } catch (MultipleLettersException e) {
            System.out.println(e.getMessage());
            return false;
        }

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
        return Phrases.lettersRemaining();
        }

        }



