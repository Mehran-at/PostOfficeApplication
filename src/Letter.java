public class Letter {
    private String address;
    private Boolean stamped = false;

    public Letter(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void stamp() {
        stamped = true;
    }

    public Boolean isStamped() {
        return stamped;
    }
}
