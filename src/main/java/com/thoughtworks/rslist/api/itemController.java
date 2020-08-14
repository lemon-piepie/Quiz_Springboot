package com.thoughtworks.rslist.api;

import com.thoughtworks.rslist.dominate.Item;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class itemController {
    private List<Item> itemList = new ArrayList<Item>();
}
