package spring.valueAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("spring.valueAnnotation");
        context.refresh();
        User user = context.getBean(User.class);
        System.out.println("username: " + user.getUsername());
        System.out.println("userRole: " + user.getUserRole());
        System.out.println("userCountry: " + user.getUserCountry());
        System.out.println("userActive: " + user.getUserActive());
        System.out.println("mySystemVal: " + user.getMySystemVal());
        System.out.println("userSkills: " + user.getUserSkills());
        System.out.println("teamMates: " + user.getTeamMates());

        System.out.println("-----UserAction-----");

        UserAction userAction = context.getBean(UserAction.class);
        userAction.show();

        CompanyService companyService = context.getBean(CompanyService.class);
        companyService.showCompanyDetails();
        context.registerShutdownHook();
        context.close();
    }

}
