public class Numbers {
    private int randomNum;

    public int getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }

    public void generateNumber(){
        double number = Math.random();
        int randomNumber = (int)(number * 100+1);
        setRandomNum(randomNumber);

    }

    public boolean compareNumbers(int guess){
        if(guess == randomNum){
            System.out.println("Congratulation, you guessed the number!!");
            return true;
        } else if (guess < randomNum){
            System.out.println("I'm sorry, your guess was too low");
            return false;
        } else if (guess > randomNum){
            System.out.println("I'm sorry, your guess was too high");
            return false;
        }
        return false;
    }
}
