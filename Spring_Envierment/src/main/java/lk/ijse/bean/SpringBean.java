package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBean implements InitializingBean {
    @Value("${os.name}")
    private String name;
    @Value("${USERNAME}")
    private String Username;

    @Value("${db.user}")
    private String db;
    @Value("${db.password}")
    private String dbPassword;
    public SpringBean() {
        System.out.println("SpringBean Constructed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
        System.out.println(Username);
        System.out.println(db);
        System.out.println(dbPassword);
    }
}
