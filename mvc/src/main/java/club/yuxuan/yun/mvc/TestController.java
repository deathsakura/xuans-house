package club.yuxuan.yun.mvc;

import club.yuxuan.yun.api.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired
    private ITestService testService;
    
    @RequestMapping("/")
    public String home () {
        return testService.getDate();
    }
    
}
