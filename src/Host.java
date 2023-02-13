public class Host extends Person{

    public Host(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void randomizeNum (){
    Numbers randomNumber = new Numbers();
    randomNumber.generateNumber();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
