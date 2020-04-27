package spring.profileAnnotation.profileAndBeanAnnotation;

public interface Animals {
    String getMessage();
}
/**
 * Define more than one profiles in @Component and @Configuration
 * using profile attributes
 *
 * @Configuration
 * @Profile({"dev", "test"})
 * public class DevEnvConfig {
 * ------
 * }
 * For XML
 * <beans profile="dev, test" >
 * <p>
 * Case-3: Use (!) with profile.
 * @Configuration
 * @Profile({"dev", "!prod"})
 * public class DevEnvConfig {
 * ------
 * } For XML
 * <beans profile="dev, !prod" >
 * The above config file will be registered if either dev or any other profile except prod such as test is activated.
 */