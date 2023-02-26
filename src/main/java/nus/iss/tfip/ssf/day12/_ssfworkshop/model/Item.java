package nus.iss.tfip.ssf.day12._ssfworkshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

  private String itemName;
  private Integer quantity;
}
