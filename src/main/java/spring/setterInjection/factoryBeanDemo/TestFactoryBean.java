package spring.setterInjection.factoryBeanDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDTO manager = (EmployeeDTO) context.getBean("manager");
        System.out.println(manager);
        EmployeeDTO director = context.getBean("director", EmployeeDTO.class);
        System.out.println(director.getDesignation());
        System.out.println(director.getFirstName());
        System.out.println(director.getId());
        System.out.println(director.getLastName());
        System.out.println(director);
    }
}
