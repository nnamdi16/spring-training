package spring.pojo.beanNames;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(value = {"firstBean1", "firstBean2"}, initMethod = "initMethod", destroyMethod = "destroyMethod")
    public FirstBean getFirstBean() {

        FirstBean firstBean = new FirstBean();
        firstBean.setName("First Bean");
        return firstBean;
    }

    @Bean({"secondBean1", "secondBean2"})
    public SecondBean getSecondBean() {
        return new SecondBean("Second Bean");
    }
}
