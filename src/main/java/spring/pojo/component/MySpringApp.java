package spring.pojo.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Square square = context.getBean(Square.class);
        Square square = (Square) context.getBean("getSquare");
        System.out.println(square.getSquare(3));

    }
}
