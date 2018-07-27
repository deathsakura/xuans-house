package club.yuxuan.yun.mvc;

import club.yuxuan.yun.api.account.IAccountService;
import club.yuxuan.yun.model.account.Account;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
@Api(value = "AccountController", tags = "主账号操作")
public class AccountController {
    
    @Autowired
    private IAccountService accountService;
    
    @ApiOperation("根据主键查询")
    @PostMapping("/selectByPrimaryKey")
    public Account selectByPrimaryKey(@ApiParam("ID") @RequestParam("id") String id) {
        Account account = accountService.selectByPrimaryKey(id);
        return account;
    }
    
    @ApiOperation("根据分组ID查询")
    @PostMapping("/queryByGroupId")
    public List<Account> queryByGroupId(@ApiParam("分组ID") @RequestParam("groupId") String groupId) {
        List<Account> accounts = accountService.queryByGroupId(groupId);
        return accounts;
    }
    
    @ApiOperation("根据用户名查询")
    @PostMapping("/queryByUsername")
    public List<Account> queryByUsername(@ApiParam("用户名") @RequestParam("username") String username) {
        List<Account> accounts = accountService.queryByUsername(username);
        return accounts;
    }
    
    @ApiOperation("根据网站查询")
    @PostMapping("/queryByWebsite")
    public List<Account> queryByWebsite(@ApiParam("website") @RequestParam("website") String website) {
        List<Account> accounts = accountService.queryByWebsite(website);
        return accounts;
    }
    
    @ApiOperation("添加账号")
    @PostMapping("/addAccount")
    public String addAccount(Account account) {
        int rowNum = accountService.addAccount(account);
        return "success: " + rowNum;
    }
    
    @ApiOperation("根据主键更新")
    @PostMapping("/updateByPrimaryKey")
    public String updateByPrimaryKey(Account account) {
        int rowNum = accountService.updateByPrimaryKey(account);
        return "success: " + rowNum;
    }

    @ApiOperation("根据主键删除")
    @PostMapping("/deleteByPrimaryKey")
    public String deleteByPrimaryKey(@ApiParam("ID") @RequestParam("id") String id) {
        int rowNum = accountService.deleteByPrimaryKey(id);
        return "Success: " + rowNum;
    }
    
}
