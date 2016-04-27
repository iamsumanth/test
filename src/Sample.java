public class Sample {

    private int amount;

    public Sample(int amount) {

        this.amount = amount;
    }

    public void add(int value) {
        amount = amount + value;
    }

    public int total() {
        return amount;
    }
}
