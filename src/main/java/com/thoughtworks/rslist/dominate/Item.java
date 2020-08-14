package com.thoughtworks.rslist.dominate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    private String name;
    private Integer singlePrice;
    private Integer amount;
    @Builder.Default
    private String unit = "瓶";

    public Item (String name, Integer singlePrice, Integer amount){
        this.name = name;
        this.singlePrice = singlePrice;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(Integer singlePrice) {
        this.singlePrice = singlePrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
