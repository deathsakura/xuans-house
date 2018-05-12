package club.yuxuan.yun.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @description 启动类
 *
 * @author yuxuan
 * @date 2018/5/12
 **/
@SpringBootApplication(scanBasePackages = "club.yuxuan.yun.*")
public class StarterApplication {

    /**
     * application entrance
     *
     * @author yuxuan
     * @date 2018/5/12
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
    }
    
}