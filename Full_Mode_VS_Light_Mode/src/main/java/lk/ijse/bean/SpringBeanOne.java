package lk.ijse.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;


@Component
public class SpringBeanOne {
    @Bean
    public SpringBean2 getSpringBean() {
        SpringBean3 springBean = getSpringBean3();
        SpringBean3 springBean1 = getSpringBean3();
        System.out.println(springBean);
        System.out.println(springBean1);
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 getSpringBean3() {
        return new SpringBean3();
    }
}
