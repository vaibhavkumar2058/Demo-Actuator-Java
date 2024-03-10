package com.example.Vaibhav.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Vaibhav.Repository.Repository;
import com.example.Vaibhav.Service.Productservice;
import com.example.Vaibhav.model.CartAPIData;

public class Prodcuctimpl implements Productservice{
	
	@Autowired
	private Repository repos;
	public CartAPIData saveProduct(CartAPIData t) {
		return repos.save(t);
	}
}
