package shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import shop.model.ShopImage;
@Mapper
public interface ShopImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopImage record);

    ShopImage selectByPrimaryKey(Integer id);

    List<ShopImage> selectAll();

    int updateByPrimaryKey(ShopImage record);
}