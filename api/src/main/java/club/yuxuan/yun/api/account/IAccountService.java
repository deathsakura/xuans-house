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

    List<Account> selectAll();
    
}
