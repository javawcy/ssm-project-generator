package ${package}.db.pojo;

import com.lowdad.dev.deps.db.pojo.BasePo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "hello")
public class HelloPojo extends BasePo {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String msg;
}
