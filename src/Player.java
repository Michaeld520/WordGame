public class Player extends Person{
    private int currentMoney;

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public Player(String firstName) {
        super(firstName);
        currentMoney = 1000;
    }

    public Player(String firstName, String lastName) {
        super(firstName, lastName);
        currentMoney = 1000;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + this.currentMoney;
    }

    public String parentString(){
        return super.toString();
    }

    public void reduceMoney (int amount){
        this.currentMoney = currentMoney - amount;
    }
    public void addMoney (int amount){
        this.currentMoney = currentMoney + amount;
    }
}
