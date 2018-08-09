package club.yuxuan.yun.mvc;

import club.yuxuan.yun.api.ITestService;
import club.yuxuan.yun.api.account.IAccountService;
import club.yuxuan.yun.model.DateTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @description 测试类
 *
 * @author yuxuan
 * @date 2018/5/12
 **/
@Slf4j
@Api(value = "TestController", tags = "测试项目搭建")
@RestController
public class TestController {
    
    @Autowired
    private ITestService testService;
    @Autowired
    private IAccountService accountService;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    
    @ApiOperation("唯一的get请求")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "<h1>hello, world</h1>";
    }
    
    @ApiOperation("测试服务器启动")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String home () {
        String date = testService.getDate();
        return date;
    }
    
    @ApiOperation("测试MySql连接")
    @RequestMapping(value = "/testMysql", method = RequestMethod.POST)
    public String testMysql() {
        Date date = accountService.testMysql();
        return new DateTime(date).toString("yyyy-MM-dd HH:mm:sss");
    }
    
    @ApiOperation("测试日志")
    @RequestMapping(value = "/testLog", method = RequestMethod.POST)
    public String testLog(){
        log.debug("######This is debug log...");
        log.info ("######This is info  log...");
        log.warn ("######This is warn  log...");
        log.error("######this is error log...");
        return "Success...";
    }
    
    @ApiOperation("测试Redis连接")
    @RequestMapping(value = "/testRedis", method = RequestMethod.POST)
    public String testRedis() {
        String value = redisTemplate.opsForValue().get("aaa");
        return value;
    }

    @ApiOperation("测试Date转Json")
    @RequestMapping(value = "/testJsonFormat", method = RequestMethod.POST)
    public DateTest testJsonFormat() {
        return new DateTest();
    }
    
    @ApiOperation("获取Redis中的值")
    @RequestMapping(value = "/getRedisValue", method = RequestMethod.POST)
    public String getRedisValue(@ApiParam("key") @RequestParam("key") String key) {
        String value = redisTemplate.opsForValue().get(key);
        log.debug("######TestController_getRedisValue: {}, {}", key, value);
        return value;
    }
    
}
