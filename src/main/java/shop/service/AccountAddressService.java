package shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.mapper.AccountAddressMapper;
import shop.model.AccountAddress;

@Service
public class AccountAddressService {
    @Autowired
    AccountAddressMapper accountAddressMapper;

    public int insert(AccountAddress accountAddress) {
        return accountAddressMapper.insert(accountAddress);
    }

   /* public int insert(String address) {
        accountAddressMapper.insert()
    }*/
}
