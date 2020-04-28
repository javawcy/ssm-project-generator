package ${package}.server.service;
import com.lowdad.dev.deps.web.model.Res;
import ${package}.server.model.dto.HelloDTO;


public interface HelloService {
    Res sayHello();
    Res sayHellos();
}