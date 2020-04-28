package ${package}.server.service.impl;

import ${package}.server.service.HelloService;
import org.springframework.stereotype.Service;
import ${package}.db.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import ${package}.server.model.dto.HelloDTO;
import ${package}.db.pojo.HelloPojo;
import com.lowdad.dev.deps.web.model.Res;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lowdad.dev.deps.web.model.PageInfo;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloMapper helloMapper;

    @Override
    public Res sayHello() {
        HelloPojo hello = helloMapper.selectById(1L);
        HelloDTO helloDTO = new HelloDTO();
        helloDTO.from(hello);
        return Res.success(helloDTO);
    }

    @Override
    public Res sayHellos() {
        return Res.success(
                new PageInfo<>(
                        helloMapper.selectPage(new Page<>(1, 2),
                                null),
                        HelloDTO.class));
    }
}