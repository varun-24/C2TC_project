package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;

import technoserve.c2tc.b5.entities.Item;

public class ItemDaoImplementation implements Itemdao {
	EntityManager em;
	

	public ItemDaoImplementation() {
		em=Configuration.createEntityManager();
	}

	@Override
	public void addItem(Item item) {
		em.persist(item);
	}

	@Override
	public void updateItem(Item item) {
		em.merge(item);
		
	}

	@Override
	public void deleteItem(int id) {
		Item item =SearchItem(id);
		em.remove( item);
		
	}

	@Override
	public Item SearchItem(int id) {
		Item item=em.find(Item.class,id);
		return item;
	}

	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void EndTransaction() {
		em.getTransaction().commit();
	}
	

}
