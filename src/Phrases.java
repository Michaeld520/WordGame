public class Phrases {
    static String gamePhrase;

    static StringBuilder playingPhrase;

    public static String getGamePhrase() {
        return gamePhrase;
    }

    public void setGamePhrase(String Phrase) {
        Phrases.gamePhrase = Phrase.toUpperCase();
        generatePlayPhrase(gamePhrase);
    }



    public void  generatePlayPhrase(String gamePhrase){
        this.playingPhrase = new StringBuilder(gamePhrase.replaceAll("\\p{L}", "_"));

    }

    public static boolean findLetters (String a) throws MultipleLettersException {
        boolean guessCorrect = false;
        if(a.length()>=2){
            throw (new MultipleLettersException());
        } else {
            String guessString = a.toUpperCase();
            int i = gamePhrase.indexOf(guessString);
            if(i >-1){
                guessCorrect = true;
            }
            while (i >= 0) {
                char guessChar = guessString.charAt(0);
                playingPhrase.setCharAt(i,guessChar);
                i = gamePhrase.indexOf(guessString, i + 1);

            }
            System.out.println(playingPhrase);

        }

        return guessCorrect;
        }

        public static boolean lettersRemaining (){

            if (playingPhrase.indexOf("_") < 0){
                System.out.println("You won the game!");
                return true;
            }
            return false;
        }
}
