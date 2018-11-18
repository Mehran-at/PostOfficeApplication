//        Derek wants to send a letter to Matilda.
//        Develop the code that he uses in order to stamp the letter at the post office and send it.
//        Follow the instructions below:
//        You need the following classes: Letter, PostOfficeAssistant and PostOfficeApplication.
//        The Letter has an address and also a boolean that states if it is stamped. It has a getAddress method. It also has a isStamped method that returns whether the letter has been stamped. It also has a stamp method that sets the stamped attribute to true.
//        The PostOfficeAssistant has no attributes. It has the stamp method that receives a letter and uses its stamp method. It also has the send method that receives a letter, if it is stamped it says they will send it to the address it says in the letter; if it is not stamped it says they need to stamp it first.
//        In the PostOfficeApplication class main method, create a Letter and a PostOfficeAssistant, and use it to stamp the letter and then send it.
//        Hints:
//        Keep the address simple. It should be just one String.
//        The stamped attribute is a Boolean. Remember to initialize it to false.
//        Keep it simple stupid. Don’t overdo things, just stick to what the exercise asks for.
//        Exercise 2 (1 point)
//        Later on, a postman picks the letters for that day and he delivers them.
//        Develop the code that the postman uses in order to deliver one letter and say he delivered it to its address.
//        Follow the instructions below:
//        Reuse the Letter from exercise 1 (don’t copy it, reuse the existing one from the package where it already is).
//        Reuse the PostOfficeApplication from exercise 1 (don’t copy it, reuse the existing one from the package where it already is).
//        Create the class Postman that has a list of Letter. It has the deliver method that goes through all the letters he has and one by one, says that he delivered it to its address and removes it from his list (until there are no more letters left).
//        In the PostOfficeApplication class main method, create three letters and a Postman with them, and use it to deliver all the letters.
//        Hints:
//        Keep it simple stupid. Don’t overdo things, just stick to what the exercise asks for.
        import java.util.List;
import java.util.ArrayList;
public class PostOfficeApplication {
    public static void main(String[] args) {
        Letter letter = new Letter("Shiraz, 123");
        PostOfficeAssistant assistant = new PostOfficeAssistant();
        assistant.stamp(letter);
        assistant.send(letter);
        List<Letter> letters = new ArrayList<>();
        letters.add(new Letter("Teheran"));
        letters.add(new Letter("Esfehan"));
        letters.add(new Letter("Kish"));
        Postman postman = new Postman(letters);
        postman.deliver();
    }
}
