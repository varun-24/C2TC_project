/*package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;

import technoserve.c2tc.b5.entities.ShopOwner;

public class ShopOwnerDaoImpl  implements ShopOwnerDao{
	EntityManager em;
	
	public ShopOwnerDaoImpl() {
		
	}

	@Override
	public void addShopOwner(ShopOwner so) {
		em.persist(so);
		
	}

	@Override
	public void startTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
	}

	@Override
	public void endTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().commit();
	}

	@Override
	public void updateShopOwner(ShopOwner so) {
		// TODO Auto-generated method stub
		em.merge(so);
	}

	@Override
	public void deleteShowOwner(ShopOwner so) {
		// TODO Auto-generated method stub
		em.remove(so);
	}

}
*/