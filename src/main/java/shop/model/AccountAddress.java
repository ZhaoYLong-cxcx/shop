package shop.model;

import lombok.Data;

@Data
public class AccountAddress {
    private Integer id;

    private Integer accountId;

    private String consignee;

    private String consigneeAddress;

    private String tel;

}