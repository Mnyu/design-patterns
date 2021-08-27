package _02_structural._05_facade;

import java.util.ArrayList;
import java.util.List;

public class Console {
    private List<Viewport> viewports = new ArrayList<>();
    int width, height;

    public Console(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addViewport(Viewport viewport) {
        viewports.add(viewport);
    }

    public void render() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                for (Viewport vp : viewports) {
                    System.out.println(vp.charAt(x, y));
                }
            }
            System.out.println();
        }
    }

    public static Console newConsole(int width, int height) {
        Buffer buffer = new Buffer(height, width);
        Viewport viewport = new Viewport(buffer, 30, height, 0, 0);
        Console console = new Console(width, height);
        console.addViewport(viewport);
        return console;
    }
}
