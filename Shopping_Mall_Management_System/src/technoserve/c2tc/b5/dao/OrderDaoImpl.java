package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;


import technoserve.c2tc.b5.entities.Order_details;

public class OrderDaoImpl implements OrderDao{
    EntityManager em;
	
	public OrderDaoImpl() {
		em=Configuration.createEntityManager();
	}

	@Override
	public void addOrder(Order_details order) {
		em.persist(order);
	
	}

	@Override
	public void updateOrder(Order_details order) {
		em.merge(order);

	}

	@Override
	public Order_details deleteOrder(long id) {
		Order_details order=getOrder(id);
		em.remove(order);
		return order;
	}

	@Override
	public Order_details getOrder(Long id) {
		Order_details order=em.find(Order_details.class, id);
		return order;
	}

	@Override
	public void startTransaction() {
		em.getTransaction().begin();
	}

	@Override
	public void endTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public Order_details searchOrder(long id) {
		Order_details order=em.find(Order_details.class, id);
		return order;
		
	}

	

}
