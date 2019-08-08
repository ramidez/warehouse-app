package com.ramidez.warehouse.Repositories;

import com.ramidez.warehouse.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {
    void deleteById(Long id);
}
