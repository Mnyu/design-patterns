package creational._04_singleton._07_singleton_db.solution;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SingletonDBTestCorrected {

    @Test
    public void testPopulationCalculation() {
        DummyDatabase db = new DummyDatabase();
        RecordFinderCorrected rf = new RecordFinderCorrected(db);
        Assert.assertEquals(4, rf.getTotalPopulation(new ArrayList<>(Arrays.asList("alpha", "gamma"))));
    }
}

