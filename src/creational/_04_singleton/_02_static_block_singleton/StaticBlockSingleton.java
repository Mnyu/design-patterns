package creational._04_singleton._02_static_block_singleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", ".");
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (IOException e) {
            System.err.println("Failed to create singleton");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}

// The reason why static block singleton exists is : we may have exceptions inside singleton class constructor - real trouble.
// Hence, use of static block with try/catch while initializing the Singleton instance.
