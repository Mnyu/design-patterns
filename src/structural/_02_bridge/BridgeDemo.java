package structural._02_bridge;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class BridgeDemo {
    public static void main(String[] args) {
        // Using the bridge design pattern
        RasterRenderer raster = new RasterRenderer();
        VectorRenderer vector = new VectorRenderer();
        Circle circle = new Circle(vector, 5);
        circle.draw();
        circle.resize(2);
        circle.draw();

        // DI USING GUICE
        Injector injector = Guice.createInjector(new ShapeModule());
        Circle circle2 = injector.getInstance(Circle.class);
        circle2.setRadius(3);
        circle2.draw();
        circle2.resize(2);
        circle2.draw();
        // DI (Dependency Injection framework complements the bridge design pattern)
    }
}
