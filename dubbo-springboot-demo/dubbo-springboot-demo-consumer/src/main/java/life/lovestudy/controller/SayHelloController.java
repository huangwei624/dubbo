package life.lovestudy.controller;

import life.lovestudy.service.GreetService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @DubboReference
    private GreetService greetService;

    @GetMapping("sayHello")
    public String sayHello() {
        return greetService.greet("小王");
    }
}
