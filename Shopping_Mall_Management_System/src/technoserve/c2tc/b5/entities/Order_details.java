package technoserve.c2tc.b5.entities;


import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Order_details")
public class Order_details {
	@Id
	private long Id;
	private LocalDateTime dateOfpurchase;
	private float Total;
	
	private String Customer;
	private String Shop;
	
public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public LocalDateTime getDateOfpurchase() {
		return dateOfpurchase;
	}

	public void setDateOfpurchase(LocalDateTime dateOfpurchase) {
		this.dateOfpurchase = dateOfpurchase;
	}

	public float getTotal() {
		return Total;
	}

	public void setTotal(float total) {
		Total = total;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}


	public String getShop() {
		return Shop;
	}

	

	public void setShop(String shop) {
		Shop = shop;
	}

	@Override
	public String toString() {
		return "Order_details [Id=" + Id + ", dateOfpurchase=" + dateOfpurchase + ", Total=" + Total + ", Customer="
				+ Customer + ", Shop=" + Shop + "]";
	}

	

	

	
}

	
	
	
	
	
	