package spring.springDependsOn.xml;

public class FirstBean {

    private SecondBean secondBean;

    private ThirdBean thirdBean;

    public FirstBean(SecondBean fineBean, ThirdBean thirdBean) {
        this.secondBean = fineBean;
        this.thirdBean = thirdBean;
        System.out.println("First Bean Initialized via constructor");
    }

    public void populateBeans() {
        secondBean.display();
        thirdBean.display();
    }
}
