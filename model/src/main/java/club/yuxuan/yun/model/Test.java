package club.yuxuan.yun.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @description 测试类
 *
 * @author yuxuan.han
 * @date 2018/5/18
 **/
@Getter
@Setter
public class Test {

    private Date data;
    
    public Test() {
        this.data = new Date();
    }
    
}
