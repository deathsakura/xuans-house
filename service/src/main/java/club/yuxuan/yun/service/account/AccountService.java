package club.yuxuan.yun.service.account;

import club.yuxuan.yun.api.account.IAccountService;
import club.yuxuan.yun.datesource.mysql.AccountMapper;
import club.yuxuan.yun.model.account.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @description 账号Service
 *
 * @author yuxuan
 * @date 2018/5/19
 **/
@Slf4j
@Service("accountService")
public class AccountService implements IAccountService {
	
	@Autowired
	private AccountMapper accountMapper;

	@Override
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<Account> selectAll() {
		List<Account> accounts = accountMapper.selectAll();
		log.debug("######selectAll_result: {}", accounts);
		return accounts;
	}
}
