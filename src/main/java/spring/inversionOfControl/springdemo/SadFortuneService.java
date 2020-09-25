package spring.inversionOfControl.springdemo;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is not a sad day but a great day!!!!";
    }
}
