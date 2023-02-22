package org.camilogo1200.main;

import org.camilogo1200.config.ProjectConfig;
import org.camilogo1200.config.RegisterBeanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        //AddBeansToContextUsingBeanAnnotation();
        AddBeansUsingRegisterBeanOnContext();


    }

    private static void AddBeansUsingRegisterBeanOnContext() {
        var context = new AnnotationConfigApplicationContext(RegisterBeanConfiguration.class);
        Parrot x = new Parrot("New Register Parrot");
        Supplier<Parrot> parrotSupplier = () -> x;

        context.registerBean("parrot1", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
    }

    private static void AddBeansToContextUsingBeanAnnotation() {
        /* Manual way using @Bean
         * no need for @Component or @ComponentScan
         * */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var p = context.getBean("parrot1", Parrot.class);
        System.out.println(p);

        var p2 = context.getBean("parrot2", Parrot.class);
        System.out.println(p2);

        var p3 = context.getBean("MyNamedBean", Parrot.class);
        System.out.println(p3);

        var p4 = context.getBean("valueNamedBean", Parrot.class);
        System.out.println(p4);

        var defaultParrot = context.getBean(Parrot.class);
        System.out.println(defaultParrot);

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);
    }
}