package technoserve.c2tc.b5.dao;

import technoserve.c2tc.b5.entities.Customer;

public interface CustomerDao {
	 public void addCustomer(Customer customer);
		public void updateCustomer(Customer customer);
		public void deleteCustomer(long id);
		public Customer getCustomer(Long id);
	    public void startTranscation();
	    public void EndTranscation();
		

}
