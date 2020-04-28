package spring.autowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"autowired"});
        Customer customer = (Customer) context.getBean("customerBean");
        System.out.println(customer);

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = new Person();
        person.setName("James");
        person.setAddress("Lagos");
        person.setAge(12);
        Customer customer1 = context1.getBean(Customer.class);
        customer1.setPerson(person);
        customer1.setAction("Move");
        customer1.setType(1);
        System.out.println(customer1);

    }
}
