package katas.primefactors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by shawncao on 9/22/15.
 */
@RunWith(JUnit4.class)
public class PrimeFactorsTest {

    @Test
    public void one() throws Exception{
        assertEquals(asList(),PrimeFactors.computePrimeFactor(1));
    }

    @Test
    public void twoHasOnlyItselfAsPrimeFactor(){
        assertEquals(asList(2),PrimeFactors.computePrimeFactor(2));
    }

    @Test
    public void threeHasOnlyItselfAsPrimeFactor(){
        assertEquals(asList(3),PrimeFactors.computePrimeFactor(3));
    }

    @Test
    public void fourHasTwoTimesTwoPrimeFactor(){
        assertEquals(asList(2,2),PrimeFactors.computePrimeFactor(4));
    }

    @Test
    public void fiveHasOnlyItselfPrimeFactor(){
        assertEquals(asList(5),PrimeFactors.computePrimeFactor(5));
    }

    @Test
    public void sixHasOnlyTwoAndThreePrimeFactor(){
        assertEquals(asList(2,3),PrimeFactors.computePrimeFactor(6));
    }

    @Test
    public void eightHasThreeTimesTwoPrimeFactor(){
        assertEquals(asList(2,2,2),PrimeFactors.computePrimeFactor(8));
    }

    @Test
    public void nineHasTwoTimesThreePrimeFactor(){
        assertEquals(asList(3,3),PrimeFactors.computePrimeFactor(9));
    }

    @Test
    public void tenHasTwoAndFiveAsPrimeFactor(){
        assertEquals(asList(2,5),PrimeFactors.computePrimeFactor(10));
    }
}
