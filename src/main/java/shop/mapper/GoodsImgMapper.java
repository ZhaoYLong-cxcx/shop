package shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import shop.model.GoodsImg;
@Mapper
public interface GoodsImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsImg record);

    GoodsImg selectByPrimaryKey(Integer id);

    List<GoodsImg> selectAll();

    int updateByPrimaryKey(GoodsImg record);
}