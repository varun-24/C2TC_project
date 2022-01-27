package technoserve.c2tc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import technoserve.c2tc.Service.ShopService;
import technoserve.c2tc.entities.Shop;
import technoserve.c2tc.entities.Student;


@RestController
public class Controller {
	@Autowired
	ShopService ss;
	@PostMapping("/addShop")
	public void addShop(@RequestBody Shop s)
	{
		ss.addShop(s);
	}
	
}
