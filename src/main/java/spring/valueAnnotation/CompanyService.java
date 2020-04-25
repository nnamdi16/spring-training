package spring.valueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    private String compName;
    private String location;

    public CompanyService(@Value("${cp.company.name}") String compName, @Value("${cp.company.location:Las Vegas}") String location) {
        this.compName = compName;
        this.location = location;
    }

    public void showCompanyDetails() {
        System.out.println("Company name : " + compName);
        System.out.println("Company location: " + location);
    }
}
