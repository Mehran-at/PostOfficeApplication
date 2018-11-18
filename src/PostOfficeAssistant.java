public class PostOfficeAssistant {
    public void stamp(Letter letter) {
        letter.stamp();
    }
    public void send(Letter letter) {
        if(letter.isStamped()) {
            System.out.print("\nWe will send your letter to the this address: " + letter.getAddress());
        }
        else {
            System.out.print("\nYou letter needs to be stamped before sending!");
        }
    }
}