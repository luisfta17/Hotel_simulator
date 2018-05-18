package hotel.guests;

public class Guest {
    protected String name;
    protected int wallet;
    public Guest(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return this.name;
    }

    public int getWallet() {
        return this.wallet;
    }
}
