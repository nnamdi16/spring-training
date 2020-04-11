package spring.setterInjection.setterInjectionMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ShoppingList shoppingList = context.getBean("shoppingList", ShoppingList.class);
        shoppingList.displayInfo();
    }
}
