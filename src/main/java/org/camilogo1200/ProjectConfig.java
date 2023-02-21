package org.camilogo1200;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot getParrot() {
        return new Parrot("Koko");
    }
}
