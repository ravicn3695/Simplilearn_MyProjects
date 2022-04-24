package com.ecommerce.springjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.springjdbc.dao.EProductDAO;
import com.ecommerce.springjdbc.entity.EProduct;

@Controller
public class MainController {

	@Autowired
	EProductDAO eproductDAO;

	@RequestMapping
	(value = "/listProducts", method = RequestMethod.GET)
	
	public String listProducts(ModelMap model) {
		List<EProduct> productlist = eproductDAO.getProducts();
		model.addAttribute("list", productlist);
		return "listProducts";
	}

}
