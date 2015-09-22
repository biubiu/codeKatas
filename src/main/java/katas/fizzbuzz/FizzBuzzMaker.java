package katas.fizzbuzz;

/**
 * Created by shawncao on 9/21/15.
 */
public class FizzBuzzMaker {

    public static String translate(int number) {
        WordHandler commonNumberHandler = new CommonNumberHandler(null);
        WordHandler buzzHandler = new BuzzHandler(commonNumberHandler);
        WordHandler fizzHandler = new FizzHandler(buzzHandler);
        WordHandler fizzBuzzHandler = new FizzBuzzHandler(fizzHandler);
        WordHandler whizzHandler = new WhizzHandler(fizzBuzzHandler);
        return whizzHandler.handle(number);
    }
}
