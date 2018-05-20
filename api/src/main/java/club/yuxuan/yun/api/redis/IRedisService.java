package club.yuxuan.yun.api.redis;
/**
 * @description redis相关操作
 *
 * @author yuxuan
 * @date 2018/5/19
 **/
public interface IRedisService {

    /**
     * 获取redis中String类型的值
     *
     * @author yuxuan
     * @date 2018/5/19
     * @param key
     * @return java.lang.String
     * @throws
     */
    String getValue(String key);
    
}
