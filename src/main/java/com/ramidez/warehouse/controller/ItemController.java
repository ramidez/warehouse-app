package com.ramidez.warehouse.controller;

import com.ramidez.warehouse.Repositories.ItemRepository;
import com.ramidez.warehouse.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @RequestMapping("/item")
    public String showForm(Model model) {
        model.addAttribute("item", new Item());
        return "item";
    }

    @PostMapping("/add-item")
    public String addItem(@ModelAttribute("item") Item item){
        itemRepository.save(item);
        return "redirect:/home";
    }
}
