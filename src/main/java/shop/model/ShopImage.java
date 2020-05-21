package shop.model;

import lombok.Data;

@Data
public class ShopImage {
    private Integer id;

    private Integer shopId;

    private Integer kindId;

    private Integer sortNum;

    private String image;

}