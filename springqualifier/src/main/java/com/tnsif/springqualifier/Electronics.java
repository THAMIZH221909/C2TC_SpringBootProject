package com.tnsif.springqualifier;

import org.springframework.stereotype.Component;

@Component
public class Electronics implements ShoppingMall{
	public void purchase() {
		System.out.println("I am going to order some gadgets");
	}


}
