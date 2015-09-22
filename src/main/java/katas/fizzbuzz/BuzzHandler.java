package katas.fizzbuzz;

/**
 * Created by shawncao on 9/21/15.
 */
public class BuzzHandler extends WordHandler {
    public BuzzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handle(int number) {
        if (number % 5 == 0) {
            return "buzz";
        }
        return successor.handle(number);
    }
}
