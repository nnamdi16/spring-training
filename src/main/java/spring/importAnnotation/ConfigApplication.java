package spring.importAnnotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(OtherAppConfig.class)
public class ConfigApplication {
}
