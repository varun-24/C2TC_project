package technoserve.c2tc.b5.dao;


import technoserve.c2tc.b5.entities.Order_details;

public interface OrderDao {
	public void addOrder(Order_details order);
	public Order_details getOrder(Long id);
	public void updateOrder(Order_details order);
    public Order_details searchOrder(long id);
    public Order_details deleteOrder(long id);
    public void startTransaction();
	public void endTransaction();
   
}
