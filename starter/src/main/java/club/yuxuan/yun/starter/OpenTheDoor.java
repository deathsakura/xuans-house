package club.yuxuan.yun.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @description 启动类
 *
 * @author yuxuan
 * @date 2018/5/12
 **/
@SpringBootApplication(scanBasePackages = "club.yuxuan.yun.**")
public class OpenTheDoor {

    /**
     * application entrance
     *
     * @author yuxuan
     * @date 2018/5/12
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        SpringApplication.run(OpenTheDoor.class, args);
    }
    
}