package technoserve.c2tc.b5.service;

import java.util.List;

import technoserve.c2tc.b5.entities.Shop;

public interface ShopService {
	public void addShop(Shop s);
	public List<Shop> getShopById(long sid);
	public List<Shop> getShopByName(String sname);
	public void updateShop(Shop s);
	public void deleteShop(long sid);
	

}
