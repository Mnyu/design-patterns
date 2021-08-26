package creational._04_Singleton._07_singleton_db.problem;

import com.google.common.collect.Iterables;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingletonDB {

    private static int instanceCount = 0;
    private static final SingletonDB INSTANCE = new SingletonDB();
    private Map<String, Integer> capitals = new HashMap<>();

    private SingletonDB() {
        instanceCount++;
        System.out.println("Initializing DB...");
        try {
            File f = new File(SingletonDB.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            Path fullPath = Paths.get(f.getPath(), "capitals.txt");
            List<String> lines = Files.readAllLines(fullPath);
            Iterables.partition(lines, 2)
                    .forEach(kv -> capitals.put(kv.get(0).trim(), Integer.parseInt(kv.get(1))));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SingletonDB getInstance() {
        return INSTANCE;
    }

    public static int getCount() {
        return instanceCount;
    }

    public int getPopulation(String name) {
        return capitals.get(name);
    }
}
// This is a demo of creating an in-memory db (data from file) singleton class.

// WHAT EXACTLY IS WRONG WITH THIS?
// Imaging we have RecordFinder class that calculates total population of specified cities.
// The way to implement that is below but the problem is with testing that class. It requires a live db.
// The problem here is, we are testing with live db - capitals.txt, and we need to know data from live db,
// rather, for unit test we should be using dummy data. This actually is like an integration test.

// SOLUTION :

class RecordFinder {
    public int getTotalPopulation(List<String> names) {
        int population = 0;
        for (String name : names) {
            population += SingletonDB.getInstance().getPopulation(name); // This is causing problem in unit testing.
        }
        return population;
    }
}

// Test in SingletonDBTest class
