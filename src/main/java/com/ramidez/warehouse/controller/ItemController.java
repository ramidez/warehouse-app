package com.ramidez.warehouse.controller;

import com.ramidez.warehouse.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    @RequestMapping("/item")
    public String showForm(Model model) {
        Item item = new Item();
        model.addAttribute("item", item);
        return "item";
    }
}
