package club.yuxuan.yun.common.util;

import okhttp3.*;
import org.apache.shiro.SecurityUtils;

/**
 * @description httpUtil
 *
 * @author yuxuan.han
 * @date 2018/5/12
 **/
public class OkHttpUtil {
    
    private static volatile OkHttpUtil okHttpUtil;
    
    private static MediaType mediaType;
    
    private static OkHttpClient client;

    private OkHttpUtil() {
        mediaType = MediaType.parse("application/json; charset=utf-8");
        client = new OkHttpClient();
    }

    /**
     * 获取Util实例
     *
     * @author yuxuan
     * @date 2018/5/19
     * @param
     * @return club.yuxuan.yun.common.util.OkHttpUtil
     * @throws
     */
    public static final OkHttpUtil getInstence() {
        if (okHttpUtil == null) {
            synchronized (OkHttpUtil.class) {
                if (okHttpUtil == null) {
                    okHttpUtil = new OkHttpUtil();
                }
            }
        }
        return okHttpUtil;
    }

    /**
     * http post请求
     *
     * @author yuxuan
     * @date 2018/5/19
     * @param url
     * @param paramJson
     * @return java.lang.String
     * @throws
     */
    public String post(String url, String paramJson) throws Exception {
        RequestBody body = RequestBody.create(mediaType, paramJson);
        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", (String) SecurityUtils.getSubject().getPrincipal())
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        if(response.isSuccessful()){
            String resultJson = response.body().string();
            return resultJson;
        }
        return null;
    }
    
}
