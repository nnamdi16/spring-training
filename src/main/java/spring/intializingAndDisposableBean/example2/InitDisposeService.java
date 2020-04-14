package spring.intializingAndDisposableBean.example2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitDisposeService implements InitializingBean, DisposableBean {
    /**
     * Do some processes
     */

    public void doSomething() {
        System.out.println("InitDisposeService.doSomething");
    }

    /**
     * Initialize bean after property set
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitDispose.afterProperties");
    }

    /**
     * Clean-up bean when the context is closed.
     *
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("InitDispose.destroy");
    }


}
