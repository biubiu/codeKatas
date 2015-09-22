package katas.fizzbuzz;

/**
 * Created by shawncao on 9/21/15.
 */
public class CommonNumberHandler extends WordHandler {
    public CommonNumberHandler(WordHandler successor) {
        super(successor);
    }

    @Override
    public String handle(int number) {
        return Integer.valueOf(number).toString();
    }
}
