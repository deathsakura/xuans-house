package club.yuxuan.yun.mvc;

import club.yuxuan.yun.api.ITestService;
import club.yuxuan.yun.api.account.IAccountService;
import club.yuxuan.yun.model.account.Account;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description 测试类
 *
 * @author yuxuan
 * @date 2018/5/12
 **/
@Api(value = "TestController", tags = "测试项目搭建")
@RestController
public class TestController {
    
    @Autowired
    private ITestService testService;
    @Autowired
    private IAccountService accountService;
    
    @ApiOperation("测试接口")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String home () {
        return testService.getDate();
    }
    
    @ApiOperation("查询全部")
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Account> getAll() {
        return accountService.selectAll();
    }
    
}
