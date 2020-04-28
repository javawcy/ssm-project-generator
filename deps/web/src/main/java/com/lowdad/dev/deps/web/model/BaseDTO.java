package com.lowdad.dev.deps.web.model;

import com.lowdad.dev.deps.db.pojo.BasePo;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

/**
 * @author Chongyu
 * @time 2020/4/28
 */
@ToString
@Data
public class BaseDTO<P extends BasePo> implements Transfer<P>, Serializable {

    private static final long serialVersionUID = 7333100215537142625L;

    @Override
    public void from(P p) {
        BeanUtils.copyProperties(p, this);
    }

    @Override
    public P toPo(Class<P> clazz) {
        P p = BeanUtils.instantiateClass(clazz);
        BeanUtils.copyProperties(this,p);
        return p;
    }
}
