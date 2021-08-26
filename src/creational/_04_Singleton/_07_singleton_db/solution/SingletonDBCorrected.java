package creational._04_Singleton._07_singleton_db.solution;

import com.google.common.collect.Iterables;
import creational._04_Singleton._07_singleton_db.problem.SingletonDB;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingletonDBCorrected implements Database {
    private static int instanceCount = 0;
    private static final SingletonDBCorrected INSTANCE = new SingletonDBCorrected();
    private Map<String, Integer> capitals = new HashMap<>();

    private SingletonDBCorrected() {
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

    public static SingletonDBCorrected getInstance() {
        return INSTANCE;
    }

    public static int getCount() {
        return instanceCount;
    }

    public int getPopulation(String name) {
        return capitals.get(name);
    }
}

class RecordFinderCorrected {
    private Database database;

    public RecordFinderCorrected(Database database) {
        this.database = database;
    }

    public int getTotalPopulation(List<String> names) {
        int population = 0;
        for (String name : names) {
            population += database.getPopulation(name); // Abstraction(Interface) is used instead of concrete class
            // We can now mimic this database with dummy data.
        }
        return population;
    }
}
