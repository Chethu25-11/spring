package com.xworkz.product.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CosmeticProduct {
  @Autowired
  public CosmeticProduct CosmeticProduct;

    public void checkSkinType(){
      System.out.println("suitable for:all skins");
  }
  public void apply(){
      System.out.println("applying  CosmeticProduct  for skins ");
  }
  public void remove(){
      System.out.println("removing the cosmetic");
  }
}
