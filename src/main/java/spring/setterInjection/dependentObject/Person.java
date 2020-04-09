package spring.setterInjection.dependentObject;

public class Person {
    private int id;
    private String name;
    private Address1 address1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address1 getAddress1() {
        return address1;
    }

    public void setAddress1(Address1 address1) {
        this.address1 = address1;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
        System.out.println(address1);
    }
}
