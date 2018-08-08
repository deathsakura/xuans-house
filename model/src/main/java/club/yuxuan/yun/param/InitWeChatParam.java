package club.yuxuan.yun.param;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @description 接入微信接收参数
 *
 * @author yuxuan.han
 * @date 2018/8/8
 **/
@Getter
@Setter
public class InitWeChatParam implements Serializable {
    
    private static final long serialVersionUID = -8511986450914620822L;
    
    private String signature;
    
    private String timestamp;
    
    private String nonce;
    
    private String echostr;

    @Override
    public String toString() {
        return "InitWeChatParam{" +
                "signature='" + signature + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", nonce='" + nonce + '\'' +
                ", echostr='" + echostr + '\'' +
                '}';
    }
}
