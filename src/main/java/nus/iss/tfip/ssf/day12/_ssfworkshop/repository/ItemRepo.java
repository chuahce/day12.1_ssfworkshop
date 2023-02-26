package nus.iss.tfip.ssf.day12._ssfworkshop.repository;

import org.springframework.stereotype.Repository;

import nus.iss.tfip.ssf.day12._ssfworkshop.model.Item;

import java.util.*;

@Repository
public class ItemRepo {

  private List<Item> itemList;
  
  public List<Item> getCartItems() {
    
    itemList = new ArrayList<Item>();
    
    Item itm = new Item();
    itm.setItemName("Louis Vuitton");
    itm.setQuantity(5);
    itemList.add(itm);

    itm = new Item();
    itm.setItemName("Chanel");
    itm.setQuantity(6);
    itemList.add(itm);

    itm = new Item();
    itm.setItemName("Prada");
    itm.setQuantity(10);
    itemList.add(itm);

    itm = new Item();
    itm.setItemName("Hermes");
    itm.setQuantity(15);
    itemList.add(itm);

    itm = new Item();
    itm.setItemName("Bottega");
    itm.setQuantity(5);
    itemList.add(itm);

    return itemList;
  }
}