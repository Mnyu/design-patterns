package _01_creational._04_singleton._07_singleton_db.problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingletonDBTest {
    @Test
    public void testPopulationCalculation() {
        RecordFinder rf = new RecordFinder();
        // To test for some cities here, we need to know what cities exist in capitals.txt(out db) which should not be the case.
        List<String> cities = new ArrayList<>(Arrays.asList("Seoul", "Mexico City"));
        int tp = rf.getTotalPopulation(cities);
        Assert.assertEquals(17500000 + 17400000, tp);
    }
}
// The problem here is, we are testing with live db - capitals.txt, and we need to know data from live db
// rather for unit test we should be using dummy data. This actually is like an integration test.

// SOLUTION :
