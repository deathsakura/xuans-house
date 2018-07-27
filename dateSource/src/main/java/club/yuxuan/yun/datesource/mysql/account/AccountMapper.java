package club.yuxuan.yun.datesource.mysql.account;

import club.yuxuan.yun.model.account.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description
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
	 * @param
	 * @return java.util.List<club.yuxuan.yun.model.account.Account>
	 * @throws
	 */
	List<Account> selectAll();

	Account selectByPrimaryKey(String id);

	int deleteByPrimaryKey(String id);

	int insert(Account record);

	int insertSelective(Account record);

	int updateByPrimaryKey(Account record);

	int updateByPrimaryKeySelective(Account record);

    List<Account> queryByUsername(@Param("username") String username);

    List<Account> selectByGroupId(@Param("groupId") String groupId);
}

