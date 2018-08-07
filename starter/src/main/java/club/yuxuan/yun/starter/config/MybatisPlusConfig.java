package club.yuxuan.yun.starter.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("club.yuxuan.yun.datesource.**")
public class MybatisPlusConfig {
    
    /**
     * 分页插件
     * 
     * @author yuxuan.han
     * @date 2018/8/3
     * @return 
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }
    
}
