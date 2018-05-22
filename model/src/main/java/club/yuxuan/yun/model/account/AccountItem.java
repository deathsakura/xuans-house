package club.yuxuan.yun.model.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @description 账号明细
 *
 * @author yuxuan
 * @date 2018/5/20
 **/
@Setter
@Getter
@ApiModel("账号明细")
public class AccountItem implements Serializable {
    
    private static final long serialVersionUID = 5705540605428334360L;

    /**
     * ID
     */
    @ApiModelProperty("ID")
    private String id;

    /**
     * 账号ID
     */
    @ApiModelProperty("账号ID")
    private String accountId;

    /**
     * 键
     */
    @ApiModelProperty("键")
    private String key;

    /**
     * 值
     */
    @ApiModelProperty("值")
    private String value;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;

    @Override
    public String toString() {
        return "AccountItem{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", remark='" + remark + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}