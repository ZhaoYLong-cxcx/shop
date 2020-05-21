package shop.model;

import lombok.Data;

@Data
public class GoodsImg {
    private Integer id;

    private Integer goodsId;

    private Integer kindId;

    private Integer sortNum;

    private String image;

}