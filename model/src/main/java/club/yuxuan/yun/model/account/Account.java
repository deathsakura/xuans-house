package club.yuxuan.yun.model.account;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
/**
 * @description 账号
 *
 * @author yuxuan
 * @date 2018/5/19
 **/
@Setter
@Getter
@ApiModel("账号")
public class Account implements Serializable {

    private static final long serialVersionUID = -7795804396904895045L;
    
    private String id;
    
    private String username;

    private String password;

    private String email;
    
    private String phone;
    
    private Boolean realName;
    
    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
