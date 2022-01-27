package technoserve.c2tc.b5.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import technoserve.c2tc.b5.enu.item_category;



@Entity
public class Item {
	@Id
	private long id;
	private String name;
	private Date manufacturing;
	private Date expiry;
	private float price;
    
	

	private item_category cate;
	
	
	public item_category getCate() {
		return cate;
	}
	public void setCate(item_category Cate) {
		this.cate = Cate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(Date manufacturing) {
		this.manufacturing = manufacturing;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry
				+ ", price=" + price + ", cate=" + cate + "]";
	}
	
		
		
	
	

}
