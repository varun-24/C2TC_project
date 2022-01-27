package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;

import technoserve.c2tc.b5.entities.Customer;



public class CustomerDaoImplementation implements CustomerDao {
EntityManager em;
public CustomerDaoImplementation()
{
	em=Configuration.createEntityManager();
}

	@Override
	public void addCustomer(Customer customer) {
		em.persist(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		em.merge(customer);
		
	}

	@Override
	public void deleteCustomer(long id) {
		Customer customer=getCustomer(id);
		em.remove(customer);
	}
		
	

	@Override
	public Customer getCustomer(Long id) {
		Customer customer=em.find(Customer.class,id);
		return customer;
		
	}

	@Override
	public void startTranscation() {
		em.getTransaction().begin();
		
	}

	@Override
	public void EndTranscation() {
		em.getTransaction().begin();
	}
     
}
