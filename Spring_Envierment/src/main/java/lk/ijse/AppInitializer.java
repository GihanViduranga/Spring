package lk.ijse;

import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;
import java.util.PropertyPermission;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*Map<String, String> envMap = System.getenv();
        //print envMap
        for (Map.Entry<String, String> entry : envMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }*/


        //Access Predefined Properties From Java
        /*Properties property = System.getProperties();
        for (String key : property.stringPropertyNames()) {
            System.out.println(key + " = " + property.get(key));
        }*/


        context.registerShutdownHook();
    }
}