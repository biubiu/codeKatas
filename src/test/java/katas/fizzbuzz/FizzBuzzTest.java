package katas.fizzbuzz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by shawncao on 9/21/15.
 */
@RunWith(JUnit4.class)
public class FizzBuzzTest {

    @Test
    public void given_one_should_say_one(){
        assertEquals("Failure - given one should say one", "1", FizzBuzzMaker.translate(1));
    }

    @Test
    public void given_three_should_say_fizz(){
        assertEquals("Failure - given three should say fizz", "fizz", FizzBuzzMaker.translate(3));
    }


    @Test
    public void given_five_should_say_buzz(){
        assertEquals("Failure - given five should say buzz", "buzz", FizzBuzzMaker.translate(5));
    }

    @Test
    public void given_fifteen_should_say_fizzbuzz(){
        assertEquals("Failure - given 15 should say fizzBuzz", "fizzBuzz", FizzBuzzMaker.translate(15));
    }

    @Test
    public void given_seven_should_say_whizz(){
        assertEquals("Failure - given 7 should say whizz", "whizz", FizzBuzzMaker.translate(7));
    }
}
