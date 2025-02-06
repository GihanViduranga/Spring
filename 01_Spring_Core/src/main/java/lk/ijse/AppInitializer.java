package lk.ijse;

import lk.ijse.bean.*;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        //SpringBean bean = new SpringBean();
        /*SpringBean bean = context.getBean(SpringBean.class);
        bean.sayHello();

        TestBean1 bean2 = context.getBean(TestBean1.class);
        System.out.println(bean2);

        TestBean2 bean3 = context.getBean(TestBean2.class);
        System.out.println(bean3);


        // meken passe kisima context ekak ran wenne na
        //context.close();


        // meka dammahama JVM eka shuttdown wena welawema thama context eka close wenne
        *//*Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutting down");
                context.close();
            }
        });*//*

        // mekenuth wenne uda karapu ekama thama meka method ekak
        context.registerShutdownHook();

        TestBean3 bean4 = context.getBean(TestBean3.class);
        System.out.println(bean4);*/

        // spring bean class eka me vidiyata gannath puluwan
        /*Object bean = context.getBean("springBean"); meke class eke @Component("bean") mehema dipu nisa wada karanne na ehema nodi dunnoth wada
        System.out.println(bean);*/

        /*Object bean = context.getBean("bean");
        System.out.println(bean);

        Object bean2 = context.getBean("testBean1");
        System.out.println(bean2);

        TestBean2 bean3 = (TestBean2) context.getBean("testBean2");
        System.out.println(bean3);

        TestBean3 bean4 = context.getBean("testBean3", TestBean3.class);
        System.out.println(bean4);

        //directery eken eliye tina class walatath anotation dala object hadaganna puluwan
        *//*MyConnection connection = context.getBean(MyConnection.class);
        System.out.println(connection);*//*

        MyConnection connection = (MyConnection) context.getBean("bean2");// me config ekata bean id ekak dila tinne bean2 kiyala
        System.out.println(connection);*/

        TestBean1 ref1 = context.getBean(TestBean1.class);
        System.out.println(ref1);

        TestBean1 ref2 = context.getBean(TestBean1.class);
        System.out.println(ref2);

        TestBean1 ref3 = context.getBean(TestBean1.class);
        System.out.println(ref3);

        MyConnection ref4 = context.getBean(MyConnection.class);
        System.out.println(ref4);

        MyConnection ref5 = context.getBean(MyConnection.class);
        System.out.println(ref5);

        context.registerShutdownHook();
    }

}
