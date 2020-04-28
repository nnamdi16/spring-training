package spring.autowiredAnnotation.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Country2 {
    private String countryName;

    @Autowired
    @Qualifier(value = "myCapital2")
    private Capital capital;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country2{" +
                "countryName='" + countryName + '\'' +
                ", capital=" + capital +
                '}';
    }
}
