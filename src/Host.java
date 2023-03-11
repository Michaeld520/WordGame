import java.util.Scanner;

public class Host extends Person{

    public Host(String firstName, String lastName) {
        super(firstName, lastName);
        this.choosePhrase();
    }

    public void choosePhrase(){

        System.out.println(this.getFirstName() + " " + this.getLastName() + ", Please choose a phrase");
        Scanner scanner = new Scanner(System.in);
        String Phrase = scanner.nextLine();
        Phrases phrase = new Phrases();
        phrase.setGamePhrase(Phrase);
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
