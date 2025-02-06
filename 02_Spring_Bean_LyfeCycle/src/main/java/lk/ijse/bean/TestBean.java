package lk.ijse.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Component
public class TestBean {
    public TestBean() {
        System.out.println("TestBean constructor");
    }
}
