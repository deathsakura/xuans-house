package club.yuxuan.yun.service;

import club.yuxuan.yun.api.ITestService;
import club.yuxuan.yun.model.TestDate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description 111
 *
 * @author yuxuan.han
 * @date 2018/5/18
 **/
@Service("testService")
public class TestServiceImpl implements ITestService {
    
    @Override
    @Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
    public String getDate() {
        return String.valueOf(new TestDate().getData());
    }

    public static void main(String[] args) {
        
    }
    
}
