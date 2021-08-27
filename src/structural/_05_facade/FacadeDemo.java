package structural._05_facade;

public class FacadeDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(30, 20);
        Viewport viewport = new Viewport(buffer, 30, 20, 0, 0);
        Console console = new Console(30, 20);
        console.addViewport(viewport);
        console.render();
        // If we look carefully, the initialization of console is very low level.
        // The problem with this is that the user might not necessarily want to go through all of this low level API.
        // This is precisely where the facade pattern comes in.

        // FACADE : will essentially provide a simplified API over a set of subsystems(here buffer, viewport, console)
        // The user might not be necessarily interested in the fact that Buffers and Viewports even exist.
        Console newConsole = Console.newConsole(30, 20);
        newConsole.render();
    }
}
