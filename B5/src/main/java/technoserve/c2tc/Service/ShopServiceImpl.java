package technoserve.c2tc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import technoserve.c2tc.entities.Shop;
import technoserve.c2tc.entities.Student;
import technoserve.c2tc.repo.ShopRepo;


@Service 
public class ShopServiceImpl implements ShopService {
    @Autowired
	ShopRepo sr ;
	
	@Override
	@RequestMapping
	public void addShop(Shop s) {
		sr.save(s);
	}

	

	
	
}
