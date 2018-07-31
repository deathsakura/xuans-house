package club.yuxuan.yun.datesource.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description dual的通用查询
 *
 * @author yuxuan.han
 * @date 2018/7/31
 **/
@Mapper
@Component
public interface DualMapper {
    
    /**
     * 查询数据库时间
     * 
     * @author yuxuan.han
     * @date 2018/7/31
     * @return 
     */
    Date getSysDate();
    
}
