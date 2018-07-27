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
     * @return java.util.List<club.yuxuan.yun.model.account.Account>
     */
    List<Account> selectAll();

    /**
     * 根据用户名查询
     * 
     * @author yuxuan.han
     * @date 2018/7/27
     * @param username 用户名
     * @return java.util.List<club.yuxuan.yun.model.account.Account>
     */
    List<Account> queryByUsername(String username);

    /**
     * 根据主键查询
     * 
     * @author yuxuan.han
     * @date 2018/7/27
     * @param id 主键
     * @return club.yuxuan.yun.model.account.Account
     */
    Account selectByPrimaryKey(String id);

    /**
     * 根据分组ID查询
     *
     * @author yuxuan.han
     * @date 2018/7/27
     * @param groupId
     * @return java.util.List<club.yuxuan.yun.model.account.Account>
     * @throws
     */
    List<Account> selectByGroupId(String groupId);
}
