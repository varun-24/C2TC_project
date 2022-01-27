package technoserve.c2tc.b5.service;


import technoserve.c2tc.b5.dao.OrderDao;
import technoserve.c2tc.b5.dao.OrderDaoImpl;
import technoserve.c2tc.b5.entities.Order_details;

public class OrderServiceImpl implements OrderService {
	OrderDao od;
	public OrderServiceImpl() {
		od=new OrderDaoImpl();
	}
	@Override
	public void addOrder(Order_details order) {
		od.startTransaction();
	    od.addOrder(order);
	    od.endTransaction();
	
	
	}
	@Override
	public void updateOrder(Order_details order) {
		od.startTransaction();
		od.updateOrder(order);
		od.endTransaction();

	}
	@Override
	public long deleteOrder(long id) {
		od.startTransaction();
		od.deleteOrder(id);
		od.endTransaction();
		return id;
		
	}
	@Override
	public void searchOrder(long id) {
		od.startTransaction();
		od.searchOrder(id);
		od.endTransaction();
		
	
		
		
		
	}
	
	
	
	}

	
	


