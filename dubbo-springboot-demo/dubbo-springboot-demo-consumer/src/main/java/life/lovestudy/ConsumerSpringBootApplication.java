package life.lovestudy;

import jdk.nashorn.internal.ir.annotations.Reference;
import life.lovestudy.service.GreetService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConsumerSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringBootApplication.class, args);
    }
}