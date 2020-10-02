package spring.inversionOfControl.springdemo;

import com.paga.business.rest.client.core.BusinessClient;
import com.paga.business.rest.client.request.RegisterCustomerRequest;
import com.paga.business.rest.client.response.RegisterCustomerResponse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        //Read spring config java class


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //Get the bean from the spring container
//        Coach theCoach = context.getBean("swimCoach",SwimCoach.class);
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //Call our new swim coach methods ... has the prop values injected
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team : " + theCoach.getTeam());
        BusinessClient businessClient = new BusinessClient.Builder()
                .setPrincipal("9BF570AA-ECCF-4F11-858F-B4108535445F")
                .setApiKey("99e3d4abc6274a229a1ef4985b671238438b33aa725149edae1810125d8362c9a76f2e3e9ea2446c95092a2092b31b4e9f3638aad8a74292a9951c16bb358afa")
                .setCredential("cK8+Pq42t#U*#BH")
                .setTest(true)
                .build();

        Calendar myCalendar = new GregorianCalendar(1978, 2, 11);
        Date dob = myCalendar.getTime();
        System.out.println(dob);
        RegisterCustomerResponse response = businessClient.registerCustomer(RegisterCustomerRequest.
                builder()
                .customerFirstName("Aboy")
                .customerLastName("Lamptey")
                .customerDateOfBirth(dob)
                .referenceNumber("9v7549svsedjidcjcdjvvfcx")
                .customerEmail("biyobaku@gmail.com")
                .customerPhoneNumber("08176679378")
                .build());
        System.out.println(response);

        //close the context
        context.close();


    }
}
