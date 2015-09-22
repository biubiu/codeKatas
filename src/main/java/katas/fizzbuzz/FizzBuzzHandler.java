package katas.fizzbuzz;

/**
 * Created by shawncao on 9/21/15.
 */
public class FizzBuzzHandler extends WordHandler {
    public FizzBuzzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handle(int number) {
        if(number % 15 == 0) {
            return "fizzBuzz";
        }
        return successor.handle(number);
    }
}
