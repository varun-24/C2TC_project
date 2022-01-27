package technoserve.c2tc.b5.service;

import java.util.List;

import technoserve.c2tc.b5.dao.ShopDao;
import technoserve.c2tc.b5.dao.ShopDaoImpl;
import technoserve.c2tc.b5.entities.Shop;

public  class ShopServiceImpl implements ShopService {
	ShopDao sd;
	
   public ShopServiceImpl() {
	   sd = new ShopDaoImpl();
   }
	@Override
	public void addShop(Shop s) {
		sd.startTransaction();
		sd.addShop(s);
		sd.endTrasaction();
		
	}
	@Override
	public List<Shop> getShopById(long sid) {
		
		return sd.getShopById(sid);
	}
	@Override
	public List<Shop> getShopByName(String sname) {
		
		return sd.getShopByName(sname);
	}
	@Override
	public void updateShop(Shop s) {
		sd.startTransaction();
		sd.upadteShop(s);
		sd.endTrasaction();
		
	}
	@Override
	public void deleteShop(long sid) {
		sd.startTransaction();
		sd.deleteShop(sid);
		sd.endTrasaction();
		
	}
	

}
