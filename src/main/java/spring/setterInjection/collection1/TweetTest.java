package spring.setterInjection.collection1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TweetTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Tweet tweet = context.getBean("tweet", Tweet.class);
        tweet.displayTweet();
    }
}
