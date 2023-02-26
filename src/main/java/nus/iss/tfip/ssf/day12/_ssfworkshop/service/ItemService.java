package nus.iss.tfip.ssf.day12._ssfworkshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nus.iss.tfip.ssf.day12._ssfworkshop.model.Item;
import nus.iss.tfip.ssf.day12._ssfworkshop.repository.ItemRepo;

@Service
public class ItemService {

  @Autowired
  ItemRepo itmRepo;

  // public ItemService() {
  // itmRepo = new ItemRepo();
  // }

  public List<Item> retrieveItemList() {
    return itmRepo.getCartItems();
  }  
}
