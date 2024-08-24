package com.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {

        Map<String, Integer> inventory = new HashMap<>();
        for (String item : items) {
            if (inventory.containsKey(item)) {
                inventory.put(item, inventory.get(item) + 1);
            } else {
                inventory.put(item, 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {

        for (String item : items) {
            if (inventory.containsKey(item)) {
                inventory.put(item, inventory.get(item) + 1);
            } else {
                inventory.put(item, 1);
            }

        }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.containsKey(item)) {
                int currentValue = inventory.get(item);
                if (currentValue > 0) {
                    inventory.put(item, currentValue - 1);
                }
            }
        }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        inventory.remove(item);
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            Integer count = entry.getValue();
            if (count > 0) {
                list.add(entry);
            }
        }

        return list;
    }
}