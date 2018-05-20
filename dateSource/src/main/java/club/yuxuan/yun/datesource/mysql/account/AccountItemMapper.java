package club.yuxuan.yun.datesource.mysql.account;

import club.yuxuan.yun.model.account.AccountItem;

public interface AccountItemMapper {
	int deleteByPrimaryKey(String id);

	int insert(AccountItem record);

	int insertSelective(AccountItem record);

	AccountItem selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(AccountItem record);

	int updateByPrimaryKey(AccountItem record);
}