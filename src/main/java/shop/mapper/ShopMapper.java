package shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import shop.model.Shop;
@Mapper
public interface ShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    Shop selectByPrimaryKey(Integer id);

    List<Shop> selectAll();

    int updateByPrimaryKey(Shop record);
}