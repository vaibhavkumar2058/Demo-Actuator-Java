package com.example.Vaibhav;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vaibhav.model.CartAPIData;

@RestController
public class DemoController {
  @GetMapping("/home")
  public String Home(){
	  
	  return "home";
	  
  }
  @GetMapping("/cart")
  public String cart() {
	  return "cart";
  }
  @PostMapping("cart/add")
  public String addtoCart(@RequestBody CartAPIData apidata) {
	  System.out.println("productid:"+apidata.getProduct_id());
	  System.out.println("userID:"+apidata.getUser_id());
	  System.out.println("quantity:"+apidata.getQuantity());
	  return Integer.toString(apidata.getQuantity()) ;
  }
  
}
