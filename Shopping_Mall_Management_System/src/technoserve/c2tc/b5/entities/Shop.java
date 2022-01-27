package technoserve.c2tc.b5.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import technoserve.c2tc.b5.enu.lease_status;
import technoserve.c2tc.b5.enu.shop_category;

@Entity
public class Shop {
  @Id
 
  @Column(name="Shop_id")
  private long sid;
  private shop_category cat;
  @OneToMany(cascade = CascadeType.ALL )
  private List<Employee>shopEmployee=new ArrayList<>();
  private String sname;
  @OneToMany(cascade = CascadeType.ALL )
  private List<Item>item=new ArrayList<Item>();
  
  
  private lease_status lease;
  public long getSid() {
	return sid;
}
public void setSid(long sid) {
	this.sid = sid;
}

public List<Employee> getShopEmployee() {
	return shopEmployee;
}
public void setShopEmployee(List<Employee> shopEmployee) {
	this.shopEmployee = shopEmployee;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public List<Item> getItem() {
	return item;
}
public void setItem(List<Item> item) {
	this.item = item;
}

public lease_status getLease() {
	return lease;
}
public void setLease(lease_status lease) {
	this.lease = lease;
}
public shop_category getCat() {
	return cat;
}
public void setCat(shop_category cat) {
	this.cat = cat;
}
  
  
  
 

}
