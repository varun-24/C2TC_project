package technoserve.c2tc.b5.service;


import technoserve.c2tc.b5.entities.Order_details;

public interface OrderService {
public void addOrder(Order_details order);
public void updateOrder(Order_details order);
public long deleteOrder(long id);
public void searchOrder(long id);
//public String addItem(String item);
//public boolean cancelMall(long id);

}
