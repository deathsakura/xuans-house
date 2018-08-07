package club.yuxuan.yun.datesource.mysql.account;

import club.yuxuan.yun.model.account.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description 主账号数据库操作
 *
 * @author yuxuan
 * @date 2018/5/19
 **/
@Mapper
@Component
public interface AccountMapper {

	/**
	 * 查询全部
	 *
	 * @author yuxuan
	 * @date 2018/5/19
	 * @return java.util.List<club.yuxuan.yun.model.account.Account>
	 */
	List<Account> selectAll();

	/**
	 * 根据主键查询
	 * 
	 * @author yuxuan.han
	 * @date 2018/7/27
	 * @param id 
	 * @return club.yuxuan.yun.model.account.Account
	 */
	Account selectByPrimaryKey(String id);

	/**
	 * 根据主键删除
	 * 
	 * @author yuxuan.han
	 * @date 2018/7/27
	 * @return 
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * 新增
	 * 
	 * @author yuxuan.han
	 * @date 2018/7/27
	 * @return 
	 */
	int insert(Account record);

    /**
     * 选择插入
     * 
     * @author yuxuan.han
     * @date 2018/7/27
     * @return 
     */
	int insertSelective(Account record);

	/**
	 * 根据主键更新
	 * 
	 * @author yuxuan.han
	 * @date 2018/7/27
	 * @return 
	 */
	int updateByPrimaryKey(Account record);

	/**
	 * 根据主键选择更新
	 * 
	 * @author yuxuan.han
	 * @date 2018/7/27
	 * @return 
	 */
	int updateByPrimaryKeySelective(Account record);

	/**
	 * 根据用户名查询
	 * 
	 * @author yuxuan.han
	 * @date 2018/7/27
	 * @return 
	 */
    List<Account> queryByUsername(@Param("username") String username);

    /**
     * 根据分组ID查询
     * 
     * @author yuxuan.han
     * @date 2018/7/27
     * @return 
     */
    List<Account> queryByGroupId(@Param("groupId") String groupId);

    /**
     * 根据站点名称查询
     * 
     * @author yuxuan.han
     * @date 2018/7/27
     * @return 
     */
    List<Account> queryByWebsite(@Param("website") String website);

    /**
     * 根据OpenId查询
     * 
     * @author yuxuan.han
     * @date 2018/7/27
     * @return 
     */
    List<Account> selectByOpenId(@Param("openId") String openId);

    /**
     * 根据ID查询密码
     *
     * @author yuxuan.han
     * @date 2018/7/31
     * @return java.lang.String
     */
    String selectPasswordById(@Param("id") String id);
}

