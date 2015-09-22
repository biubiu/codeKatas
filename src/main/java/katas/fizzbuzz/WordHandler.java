package katas.fizzbuzz;

/**
 * Created by shawncao on 9/21/15.
 */
public abstract class WordHandler {
    protected WordHandler successor;

    public WordHandler(WordHandler successor) {
        this.successor = successor;
    }

    public abstract String handle(int number);
}
