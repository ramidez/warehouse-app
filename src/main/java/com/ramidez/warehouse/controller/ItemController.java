package com.ramidez.warehouse.controller;

import com.ramidez.warehouse.Repositories.ItemRepository;
import com.ramidez.warehouse.model.Item;
import com.ramidez.warehouse.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

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
        return "redirect:/item-list";
    }

    @RequestMapping("/item-list")
    public String showItemList(Model model){
        model.addAttribute("items", itemRepository.findAll());
        return "item-list";
    }

    @PostMapping("/delete")
    public String deleteItem(@RequestParam("itemId") Long id){

        itemRepository.deleteById(id);
        return "redirect:/item-list";
    }

    @PostMapping("/update")
    public String updateItem(@RequestParam("itemId") Long id, Model model){

        Item item = itemRepository.findById(id).get();

        model.addAttribute("item", item);

        return "item";



    }
}
