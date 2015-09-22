package katas.primefactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawncao on 9/22/15.
 */
public class PrimeFactors {


    public static List<Integer> computePrimeFactor(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int candidate = 2; number > 1; candidate++){
            for ( ;number % candidate == 0; number /= candidate){
                factors.add(candidate);
            }
        }
        return factors;
    }
}
