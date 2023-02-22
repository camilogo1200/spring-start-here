package org.camilogo1200.config;

import org.camilogo1200.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.camilogo1200.main")
public class ProjectConfig {
    @Bean
    Parrot getParrot() {
        return new Parrot("Koko");
    }

    @Bean
    Parrot parrot1() {
        return new Parrot("Tucky Tucky");
    }

    @Bean
    Parrot parrot2() {
        return new Parrot("Robert");
    }

    @Bean
    Parrot parrot3() {
        return new Parrot("Miki");
    }

    @Bean(value = "valueNamedBean")
    Parrot parrotBeanNaming() {
        return new Parrot("Value Name = Toto");
    }

    @Bean(name = "MyNamedBean")
    Parrot parrotBeanNaming2() {
        return new Parrot("Named Bean => Fred");
    }

    @Primary //makes the default option for spring
    @Bean
    Parrot parrot() {
        return new Parrot("Default @Primary => Dodo");
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }

}
