package shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import shop.model.AccountAddress;
@Mapper
public interface AccountAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountAddress record);

    AccountAddress selectByPrimaryKey(Integer id);

    List<AccountAddress> selectAll();

    int updateByPrimaryKey(AccountAddress record);
}