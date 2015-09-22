package katas.fizzbuzz;

/**
 * Created by shawncao on 9/21/15.
 */
public class FizzHandler extends WordHandler {
    public FizzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handle(int number) {
        if(number % 3 == 0) {
            return "fizz";
        }
        return successor.handle(number);
    }
}
