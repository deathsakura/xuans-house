package club.yuxuan.yun.model.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

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

    /**
     * ID
     */
    @ApiModelProperty("ID")
    private String id;

    /**
     * openId
     */
    @ApiModelProperty("openId")
    private String openId;

    /**
     * 网站
     */
    @ApiModelProperty("网站")
    private String website;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;
    
    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 手机
     */
    @ApiModelProperty("手机")
    private String phone;

    /**
     * 分组ID
     */
    @ApiModelProperty("分组ID")
    private String groupId;

    /**
     * 是否实名
     */
    @ApiModelProperty("是否实名")
    private Boolean realName;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", website='" + website + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", groupId='" + groupId + '\'' +
                ", realName=" + realName +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
