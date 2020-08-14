package com.thoughtworks.rslist.api;

import com.thoughtworks.rslist.dominate.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class itemController {
    private List<Item> itemList = initItemList();


    private List<Item> initItemList(){
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("可乐1",1,2));
        itemList.add(new Item("可乐2",1,1));
        itemList.add(new Item("可乐4",1,5));
        return itemList;
    }

    @RequestMapping("/goods")
    public String getGoods(@RequestBody Item item) {
        return item.getName() + item.getSinglePrice();
    }

}
