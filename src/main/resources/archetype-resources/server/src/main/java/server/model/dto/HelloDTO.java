package ${package}.server.model.dto;

import com.lowdad.dev.deps.web.model.BaseDTO;
import ${package}.db.pojo.HelloPojo;
import lombok.Data;

@Data
public class HelloDTO extends BaseDTO<HelloPojo> {
    private Long id;
    private String msg;
}