package structural._02_bridge;

import com.google.inject.AbstractModule;

public class ShapeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Renderer.class).to(VectorRenderer.class);
    }
}
