package life.lovestudy.service.impl;

import life.lovestudy.service.GreetService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class GreetServiceImpl implements GreetService {

    public String greet(String name) {
        return "hello " + name;
    }
}
