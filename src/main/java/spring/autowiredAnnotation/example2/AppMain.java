package spring.autowiredAnnotation.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void autowired(String file) {
        ApplicationContext context = new ClassPathXmlApplicationContext(file);
        if (file.equalsIgnoreCase("autowired-qualifier.xml")) {
            Country2 country = context.getBean("myCountry1", Country2.class);
            System.out.println(country.toString());
        } else {
            Country country2 = context.getBean("myCountry", Country.class);
            System.out.println(country2.toString());
        }

    }

    public static void main(String[] args) {
        int choice = Menu.displayMenu();
        switch (choice) {
            case 1:
                System.out.println("'Autowired annotation' selected");
                autowired("autowired-qualifier.xml");
                break;
            case 2:
                System.out.println("' Autowired with Qualifier annotation' selected");
                autowired("autowired1.xml");
                break;
            default:
                System.err.println("Invalid choice");

        }
    }
}
