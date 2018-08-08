package club.yuxuan.yun.service.wechat;

import club.yuxuan.yun.api.wechat.IWeChatService;
import club.yuxuan.yun.common.util.WeChatUtil;
import club.yuxuan.yun.param.InitWeChatParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @description 微信Service实现
 *
 * @author yuxuan.han
 * @date 2018/8/8
 **/
@Slf4j
@Service
@PropertySource({"classpath:constant.properties"})
public class WeChatServiceImpl implements IWeChatService {
    
    @Value("${WECHAT_INIT_TOKEN}")
    private String INIT_TOKEN;
    
    @Override
    public String initWeChat(InitWeChatParam initParam) {
        //  1）将token、timestamp、nonce三个参数进行字典序排序
        String[] strArr = new String[]{INIT_TOKEN, initParam.getTimestamp(), initParam.getNonce()};
        Arrays.sort(strArr);

        //  2）将三个参数字符串拼接成一个字符串进行sha1加密
        StringBuffer str = new StringBuffer();
        for (String tmpStr : strArr) {
            str.append(tmpStr);
        }
        String sha1 = WeChatUtil.sha1(str.toString());

        //  3）开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
        if (sha1.equals(initParam.getSignature())) {
            log.info("--------------------------------WeChatServiceImpl_initWeChat_success!");
            //  确定请求源是微信后台，原样返回echoStr
            return initParam.getEchostr();
        }
        
        log.warn("######initWeChat_failure: ", initParam);
        return null;
    }
    
}
