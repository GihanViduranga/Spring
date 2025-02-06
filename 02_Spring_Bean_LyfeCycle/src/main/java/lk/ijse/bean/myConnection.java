package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class myConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {


    @Override
    public void setBeanName(String name) {
        System.out.println("My Connection BeanNameAware");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("My Connection ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("My Connection afterPropertiesSet");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("My Connection BeanFactoryAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("My Connection destroy");
    }
    public myConnection() {
        System.out.println("MyConnection Constructor");
    }
}
