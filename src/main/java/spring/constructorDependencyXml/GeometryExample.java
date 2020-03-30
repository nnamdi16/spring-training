package spring.constructorDependencyXml;

public class GeometryExample {
    private Shape shape;

    /**
     * Injects circle object via constructor arguments
     */

    public GeometryExample(Shape shape) {
        this.shape = shape;
    }

    public void drawShape(){
        shape.draw();
    }
}
