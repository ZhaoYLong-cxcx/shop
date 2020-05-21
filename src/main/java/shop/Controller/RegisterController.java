package shop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shop.model.*;
import shop.service.*;


import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/er")
public class RegisterController {
@Autowired
RegisterService registerService;
@Autowired
AccountAddressService accountAddressService;
@RequestMapping("/log")
public String inregister(){
    return "reigister";
}
    @RequestMapping("/register")
    public String register(String name,String idCard,
                           String phoneNum,String nickname,String avatar,
                           String address,HttpServletRequest request){
        Account account=new Account();
        account.setName(name);
        account.setIdCard(idCard);
        account.setPhoneNum(phoneNum);
        account.setNickname(nickname);
        account.setAvatar(avatar);
        //注册用户添加到数据库
       int num=registerService.insert(account);

        AccountAddress accountAddress=new AccountAddress();
        accountAddress.setAccountId(account.getId());
        accountAddress.setConsignee(account.getName());
        accountAddress.setConsigneeAddress(address);
        accountAddress.setTel(account.getPhoneNum());
       int num2=accountAddressService.insert(accountAddress);

        System.out.println("===========");
        return "redirect:/er/log";
    }

}
