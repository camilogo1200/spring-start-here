package org.camilogo1200.main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Parrot {
    private String name;

   /* @PostConstruct
    public void init(){
        this.name = "KiKi :)";
    }

    @PreDestroy
    public void finish(){
        this.name = "";
    }
*/
}
