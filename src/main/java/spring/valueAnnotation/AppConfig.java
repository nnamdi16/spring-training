package spring.valueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Value annotation is used a field level
 * for expression-driven dependency injection
 * Used at parameter level of a method or a
 * constructor that indicates a default value
 * expression for the affected argument.
 * It is also used for dynamic resolution handler method parameter like in Spring MVC
 * It can be used within classes annotated with @Configuration,
 * @Component and other stereotype annotations.
 * Processing of @Value is performed by BeanPostProcessor
 * and so we cannot use @Value within BeanPostProcessor types
 */

@Configuration
@PropertySource("classpath:property/project.properties")
@ComponentScan("spring.valueAnnotation")
@ImportResource("classpath:spring/importResources/app-config")
public class AppConfig {
    @Value("${cp.user.name}")
    private String username;

//    @Value("#{userProp['cp.user.name']}")
//    private String userName;
//
//    @Value("#{userProp['cp.user.role']}")
//    private String userRole;

    @Value("${cp.user.role:Admin}")
    private String userRole;

    //    @Value("Nigeria")
    @Value("${cp.user.country}")
    private String userCountry;

    @Value("${cp.user.age:30}")
    private Integer userAge;

    @Value("${cp.user.active:false}")
    private Boolean isUserActive;

    @Value("#{systemEnvironment['java.home']}")
    private String mySystemVal;

    @Value("${cp.user.skills}")
//    @Value("#{'${cp.user.skills:Java,HTML,Spring}'.split(',')}")
    private List<String> userSkills;

    @Value("#{${cp.user.teamMates:{300:'Banish', 400:'Mandible'}}}")
    private Map<Integer, String> teamMates;

    @Bean
    public User getUser() {
        User user = new User();
        user.setUsername(username);
        user.setUserRole(userRole);
        user.setUserCountry(userCountry);
        user.setUserActive(isUserActive);
        user.setUserAge(userAge);
        user.setMySystemVal(mySystemVal);
        user.setUserSkills(userSkills);
        user.setTeamMates(teamMates);
        return user;
    }
}
