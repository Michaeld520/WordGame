public class Money implements Award{

    private int incorrectGuess = 200;

    private int correctGuess = 1000;

    @Override
    public int displayWinnings(Player player, boolean guessCorrect) {

        if (guessCorrect){
            System.out.println(player.parentString() + ", you won $" + correctGuess + "!");
            return correctGuess;
        } else {
            System.out.println(player.parentString() + ", you lose $" + incorrectGuess);
            int winnings = 0 - incorrectGuess;
            return winnings;
        }
    }
}
