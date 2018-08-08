package club.yuxuan.yun.api.wechat;

import club.yuxuan.yun.param.InitWeChatParam;

/**
 * @description 处理微信请求Service
 *
 * @author yuxuan.han
 * @date 2018/8/8
 **/
public interface IWeChatService {
    
    /**
     * 处理接入微信请求
     * 
     * @author yuxuan.han
     * @date 2018/8/8
     * @return 
     */
    String initWeChat(InitWeChatParam initParam);
}
