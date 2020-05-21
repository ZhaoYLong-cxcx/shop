package shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.mapper.AccountMapper;
import shop.model.Account;


@Service
public class RegisterService {
    @Autowired
    AccountMapper accountMapper;

    public int insert(Account account) {
        return accountMapper.insert(account);
    }
}
