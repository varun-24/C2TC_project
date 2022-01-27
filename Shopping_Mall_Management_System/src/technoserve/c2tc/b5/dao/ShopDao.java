package technoserve.c2tc.b5.dao;

import java.util.List;

import technoserve.c2tc.b5.entities.Shop;

public interface ShopDao {
	
	public void addShop(Shop s);
	public void startTransaction();
	public void endTrasaction();
	public List<Shop> getShopById(long sid);
	public List<Shop> getShopByName(String sname);
	public void upadteShop(Shop s);
	public void deleteShop(long sid);
	public Shop searchShop(Long sid);
	
	

}
