package org.camilogo1200;

import org.camilogo1200.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
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