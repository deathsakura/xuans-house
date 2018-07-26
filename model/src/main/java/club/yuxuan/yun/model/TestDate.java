package club.yuxuan.yun.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @description 测试类
 *
 * @author yuxuan.han
 * @date 2018/5/18
 **/
@Getter
@Setter
public class TestDate {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:sss", timezone="GMT+8")
    private Date data;
    
    public TestDate() {
        this.data = new Date();
    }
    
}
