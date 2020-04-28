package com.lowdad.dev.deps.web.model;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Chongyu
 * @time 2020/4/28
 */
@Data
@ToString
public class PageInfo<P,T extends Transfer<P>> implements Serializable {

    private static final long serialVersionUID = 1432522296957498800L;
    private long currentPage;
    private long pageSize;
    private long totalSize;
    private long pages;
    private List<T> records = new ArrayList<>();

    public PageInfo() {
    }

    public PageInfo(IPage<P> page, Class<T> clazz) {
        this.currentPage = page.getCurrent();
        this.pageSize = page.getSize();
        this.totalSize = page.getTotal();
        this.pages = page.getPages();

        List<T> list = new ArrayList<>();
        page.getRecords().forEach(item -> {
            T t = BeanUtils.instantiateClass(clazz);
            t.from(item);
            list.add(t);
        });
        this.records = list;
    }
}
