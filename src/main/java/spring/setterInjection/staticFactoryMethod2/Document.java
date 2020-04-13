package spring.setterInjection.staticFactoryMethod2;

public class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Print Documents in view");
    }
}
