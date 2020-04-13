package spring.setterInjection.staticFactoryMethod2;

public class File implements Printable {
    @Override
    public void print() {
        System.out.println("Prints the File in view");
    }
}
