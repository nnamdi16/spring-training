package spring.setterInjection.staticFactoryMethod2;

public class PrintableFactory {
    public static Printable getPrintable() {
        return new File();
    }
}
