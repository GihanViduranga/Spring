package lk.ijse;

import lk.ijse.Config.AppConfig;
import lk.ijse.bean.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        context.registerShutdownHook();
    }
}