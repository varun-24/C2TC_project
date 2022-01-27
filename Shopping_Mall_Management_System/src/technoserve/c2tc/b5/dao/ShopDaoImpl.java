package technoserve.c2tc.b5.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import technoserve.c2tc.b5.entities.Shop;

public class ShopDaoImpl implements ShopDao{
	EntityManager em;
	
	public ShopDaoImpl() {
		em = Configuration.createEntityManager();
	}

	@Override
	public void addShop(Shop s) {
		em.persist(s);
		
	}

	@Override
	public void startTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
	}

	@Override
	public void endTrasaction() {
		// TODO Auto-generated method stub
		em.getTransaction().commit();
	}

	@Override
	public List<Shop> getShopById(long sid) {
		String query = "Select s from Shop s where s.sid like :sid";
		TypedQuery<Shop> t = em.createQuery(query, Shop.class);
		t.setParameter("sid", sid);
		return t.getResultList();
	}

	@Override
	public List<Shop> getShopByName(String sname) {
		String query = "Select s from Shop s where s.sname like :sname";
		TypedQuery<Shop> t = em.createQuery(query, Shop.class);
		t.setParameter("sname", sname);
		return t.getResultList();
	}

	@Override
	public void upadteShop(Shop s) {
		em.merge(s);
		
	}

	@Override
	public void deleteShop(long sid) {
		Shop shop = searchShop(sid);
		em.remove(shop);
		
	}

	

	@Override
	public Shop searchShop(Long sid) {
		// TODO Auto-generated method stub
		Shop shop = em.find(Shop.class, sid);
		return shop;
		
	}
	

}
