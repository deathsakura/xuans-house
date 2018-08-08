package club.yuxuan.yun.mvc.wechat;

import club.yuxuan.yun.api.wechat.IWeChatService;
import club.yuxuan.yun.common.util.WeChatUtil;
import club.yuxuan.yun.param.InitWeChatParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @description 微信Controller
 *
 * @author yuxuan.han
 * @date 2018/8/8
 **/
@RestController
@RequestMapping("/weChat")
@Api(value = "WeChatController", tags = "微信")
public class WeChatController {
    
    @Autowired
    private IWeChatService weChatService;
    
    @ApiOperation("接入微信, 验证Token")
    @GetMapping("/initWechat")
    public String initWeChat(InitWeChatParam initParam) {

        String result = weChatService.initWeChat(initParam);
        
        return result;
    }

}
