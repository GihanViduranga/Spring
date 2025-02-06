package lk.ijse.Config;

import lk.ijse.bean.myConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {

    @Bean
    public myConnection getmyConnection(){
        return new myConnection();
    }
}
