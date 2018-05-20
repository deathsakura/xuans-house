package club.yuxuan.yun.service.redis;

import club.yuxuan.yun.api.redis.IRedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description redisService实现
 *
 * @author yuxuan
 * @date 2018/5/19
 **/
@Slf4j
@Service("redisService")
public class RedisServiceImpl implements IRedisService {
    
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    
    @Override
    @Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
    public String getValue(String key) {
        String value = redisTemplate.opsForValue().get(key);
        log.debug("######redisService_getValue: {}---{}", key, value);
        return value;
    }
}
