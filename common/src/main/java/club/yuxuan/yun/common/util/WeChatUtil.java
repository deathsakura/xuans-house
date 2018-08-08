package club.yuxuan.yun.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * @description 处理 微信请求 工具类
 *
 * @author yuxuan.han
 * @date 2018/8/8
 **/
public class WeChatUtil {

    /**
     * 对字符串进行SHA1加密
     * 
     * @author yuxuan.han
     * @date 2018/8/8
     * @return 
     */
    public static final String sha1(String str) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(str.getBytes());
        byte[] digest = md.digest();

        StringBuffer hexstr = new StringBuffer();
        String shaHex = "";
        for (int i = 0; i < digest.length; i++) {
            shaHex = Integer.toHexString(digest[i] & 0xFF);
            if (shaHex.length() < 2) {
                hexstr.append(0);
            }
            hexstr.append(shaHex);
        }
        return hexstr.toString();
    }
    
}
