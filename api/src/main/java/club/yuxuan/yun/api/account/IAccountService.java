package club.yuxuan.yun.api.account;

import club.yuxuan.yun.model.account.Account;

import java.util.List;

/**
 * @description 账号Service
 *
 * @author yuxuan
 * @date 2018/5/19
 **/
public interface IAccountService {

    /**
     * 查询全部数据
     *
     * @author yuxuan
     * @date 2018/5/27
     * @param
     * @return java.util.List<club.yuxuan.yun.model.account.Account>
     * @throws
     */
    List<Account> selectAll();
    
}
