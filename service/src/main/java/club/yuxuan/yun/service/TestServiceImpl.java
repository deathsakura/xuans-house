package club.yuxuan.yun.service;

import club.yuxuan.yun.api.ITestService;
import club.yuxuan.yun.model.Test;
import org.springframework.stereotype.Service;
/**
 * @description 111
 *
 * @author yuxuan.han
 * @date 2018/5/18
 **/
@Service("testService")
public class TestServiceImpl implements ITestService {
    
    @Override
    public String getDate() {
        return String.valueOf(new Test().getData());
    }
    
}
