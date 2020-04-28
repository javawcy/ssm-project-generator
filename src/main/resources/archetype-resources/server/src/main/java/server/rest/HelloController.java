package ${package}.server.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import ${package}.server.service.HelloService;
import ${package}.server.model.dto.HelloDTO;
import com.lowdad.dev.deps.web.model.Res;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/print")
    public Res print() {
        return Res.success("Hello Another World!");
    }

    @GetMapping("/hello")
    public Res sayHello() {
        return helloService.sayHello();
    }

    @GetMapping("/hellos")
    public Res sayHellos() {
        return helloService.sayHellos();
    }
}