package shop.model;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Goods {
    private Integer id;

    private Integer shopId;

    private Integer kindId;

    private String mainTitle;

    private BigDecimal nowPrice;

    private BigDecimal targetPrice;

    private String principalMaterial;

    private String armourClamp;

    private String glass;

}