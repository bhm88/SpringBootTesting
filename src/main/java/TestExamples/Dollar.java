package TestExamples;

public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar multiplyBy(int multiplyBy) {

        return new Dollar(amount*multiplyBy);
    }
}
