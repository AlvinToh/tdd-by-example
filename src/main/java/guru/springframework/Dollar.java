package guru.springframework;

/**
 * @Author alvin.toh
 */
public class Dollar {

    int amount;

    public Dollar (int amount) {
        this.amount = amount;
    }

    void times (int multiplier) {
        amount *= multiplier;
    }

}
