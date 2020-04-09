package spring.constructorInjection.beanInheritance;

public class Location {

    private String location1, city, state, country;

    public Location(String location1, String city, String state, String country) {
        this.location1 = location1;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String toString() {
        return location1 + " " + city + " " + state + " " + country;
    }
}
