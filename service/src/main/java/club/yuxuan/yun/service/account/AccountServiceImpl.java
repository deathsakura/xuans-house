package club.yuxuan.yun.service.account;

import club.yuxuan.yun.api.account.IAccountService;
import club.yuxuan.yun.datesource.mysql.DualMapper;
import club.yuxuan.yun.datesource.mysql.account.AccountMapper;
import club.yuxuan.yun.model.account.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
/**
 * @description 账号Service
 *
 * @author yuxuan
 * @date 2018/5/19
 **/
@Slf4j
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
	
    @Autowired
    private DualMapper dual;
	@Autowired
	private AccountMapper accountMapper;

	@Override
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<Account> selectAll() {
		List<Account> accounts = accountMapper.selectAll();
        accounts.forEach(Account::removePassword);
		return accounts;
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<Account> queryByUsername(String username) {
        List<Account> accounts = accountMapper.queryByUsername(username);
        accounts.forEach(Account::removePassword);
		return accounts;
	}

    @Override
    @Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
    public Account selectByPrimaryKey(String id) {
	    Account account = accountMapper.selectByPrimaryKey(id);
        account.removePassword();
        return account;
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
    public List<Account> queryByGroupId(String groupId) {
        List<Account> accounts = accountMapper.queryByGroupId(groupId);
        accounts.forEach(Account::removePassword);
        return accounts;
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
    public List<Account> queryByWebsite(String website) {
	    List<Account> accounts = accountMapper.queryByWebsite(website);
        accounts.forEach(Account::removePassword);
        return accounts;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int addAccount(Account account) {
        int rowNum = accountMapper.insert(account);
        return rowNum;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int updateByPrimaryKey(Account account) {
        int rowNum = accountMapper.updateByPrimaryKey(account);
        return rowNum;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deleteByPrimaryKey(String id) {
	    int rowNum = accountMapper.deleteByPrimaryKey(id);
        return rowNum;
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
    public List<Account> selectByOpenId(String openId) {
	    List<Account> accounts = accountMapper.selectByOpenId(openId);
        accounts.forEach(Account::removePassword);
        return accounts;
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
    public String selectPasswordById(String id) {
	    String pwd = accountMapper.selectPasswordById(id);
        return pwd;
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
    public Date testMysql() {
	    Date now = dual.getSysDate();
        return now;
    }

}
