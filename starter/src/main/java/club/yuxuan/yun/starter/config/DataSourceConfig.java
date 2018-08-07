package club.yuxuan.yun.starter.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @description 数据源配置
 *
 * @author yuxuan.han
 * @date 2018/8/3
 **/
@Configuration
public class DataSourceConfig {
    
    /**
     * 数据源
     * 
     * @author yuxuan.han
     * @date 2018/8/3
     * @return 
     */
    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new DruidDataSource();
    }
    
    /**
     * 事务管理器
     * 
     * @author yuxuan.han
     * @date 2018/8/3
     * @return 
     */
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    
}
