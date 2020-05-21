package shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import shop.model.Kind;
@Mapper
public interface KindMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Kind record);

    Kind selectByPrimaryKey(Integer id);

    List<Kind> selectAll();

    int updateByPrimaryKey(Kind record);
}