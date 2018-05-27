package club.yuxuan.yun.datesource.mysql.account;

import club.yuxuan.yun.model.account.Account;
import club.yuxuan.yun.model.account.AccountItem;

import java.util.List;

/**
 * @description 账号主信息
 *
 * @author yuxuan
 * @date 2018/5/27
 **/
public interface AccountItemMapper {

	/**
	 * 查询全部
	 *
	 * @author yuxuan
	 * @date 2018/5/27
	 * @param
	 * @return java.util.List<club.yuxuan.yun.model.account.Account>
	 * @throws
	 */
	List<Account> selectAll();
	
	/**
	 * 主键查询
	 *
	 * @author yuxuan
	 * @date 2018/5/27
	 * @param id
	 * @return club.yuxuan.yun.model.account.AccountItem
	 * @throws
	 */
	AccountItem selectByPrimaryKey(String id);

	/**
	 * 主键删除
	 *
	 * @author yuxuan
	 * @date 2018/5/27
	 * @param id
	 * @return int
	 * @throws
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * 插入
	 *
	 * @author yuxuan
	 * @date 2018/5/27
	 * @param record
	 * @return int
	 * @throws
	 */
	int insert(AccountItem record);

	/**
	 * 选择插入
	 *
	 * @author yuxuan
	 * @date 2018/5/27
	 * @param record
	 * @return int
	 * @throws
	 */
	int insertSelective(AccountItem record);

	/**
	 * 主键更新
	 *
	 * @author yuxuan
	 * @date 2018/5/27
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateByPrimaryKey(AccountItem record);

	/**
	 * 主键选择更新
	 *
	 * @author yuxuan
	 * @date 2018/5/27
	 * @param record
	 * @return int
	 * @throws
	 */
	int updateByPrimaryKeySelective(AccountItem record);
}