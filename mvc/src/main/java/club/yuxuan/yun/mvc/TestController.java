package club.yuxuan.yun.mvc;

import club.yuxuan.yun.model.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 测试类
 *
 * @author yuxuan
 * @date 2018/5/12
 **/
@RestController
public class TestController {
    
    @RequestMapping("/")
    public String home () {
        return new Test().getData().toString();
    }
    
}
