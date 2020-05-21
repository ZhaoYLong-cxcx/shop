package shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import shop.model.Goods;
@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    Goods selectByPrimaryKey(Integer id);

    List<Goods> selectAll();

    int updateByPrimaryKey(Goods record);
}