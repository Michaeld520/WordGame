import java.util.Random;

public class Physical implements Award{
    String[] prizes = {"Television", "Car", "Boat", "Kitchen Appliance", "Entertainment System"};

    @Override
    public int displayWinnings(Player player, boolean guessCorrect) {
        if (guessCorrect){
            System.out.println(player.parentString() + ", that letter was found,  you won a " + prizes[getRandomPrize(prizes)] + "!");
        } else {
            System.out.println(player.parentString() + ", that letter was not found, you could have won a " + prizes[getRandomPrize(prizes)]);
        }
        return 0;
    }
    public int getRandomPrize(String[]prizes){
        int random = new Random().nextInt(prizes.length);
        return random;

    }
}
