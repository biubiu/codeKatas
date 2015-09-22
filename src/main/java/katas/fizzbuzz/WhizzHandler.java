package katas.fizzbuzz;

/**
 * Created by shawncao on 9/21/15.
 */
public class WhizzHandler extends WordHandler {
    public WhizzHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handle(int number) {
        if( number % 7 == 0){
            return "whizz";
        }

        return successor.handle(number);
    }
}
