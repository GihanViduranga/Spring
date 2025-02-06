package lk.ijse;

import lk.ijse.DI.Boy;
import lk.ijse.bean.Boy1;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*Boy1 bean = context.getBean(Boy1.class);
        bean.chatWithGirl();*/

        Boy boy = (Boy) context.getBean("Boy");
        boy.chatWithGirl();

        context.registerShutdownHook();
    }
}