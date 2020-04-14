package spring.beanLifeCycle.initializingBean;

import org.springframework.beans.factory.DisposableBean;

public class EmailConfigCacheDisposable implements DisposableBean {
    @Override
    public void destroy() throws Exception {

    }
}
