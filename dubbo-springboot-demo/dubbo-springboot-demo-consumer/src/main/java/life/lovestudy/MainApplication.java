package life.lovestudy;

import jdk.nashorn.internal.ir.annotations.Reference;
import life.lovestudy.service.GreetService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        GreetService greetService = context.getBean(GreetService.class);
        System.out.println(greetService.greet("小王"));;
        System.in.read();
    }
}
