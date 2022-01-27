/*package technoserve.c2tc.b5.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import technoserve.c2tc.b5.enu.dept;
@Entity
public class Mall {
	@Id
	private long id;
	@OneToMany(cascade = CascadeType.ALL )
	private MallAdmin malladmin;
	private String mallname;
	private List<Shop> shop = new ArrayList<>();
	private dept department;
	
	public dept getDepartment() {
		return department;
	}
	public void setDepartment(dept department) {
		this.department = department;
	}
	public long getId() {
		return id;
	}
		public Mall() {
	
	}
	public void setId(long id) {
		this.id = id;
	}
	public MallAdmin getMalladmin() {
		return malladmin;
	}
	public void setMalladmin(MallAdmin malladmin) {
		this.malladmin = malladmin;
	}
	public String getMallname() {
		return mallname;
	}
	public void setMallname(String mallname) {
		this.mallname = mallname;
	}
	public List<Shop> getShop() {
		return shop;
	}
	public void setShop(List<Shop> shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "Mall [id=" + id + ", malladmin=" + malladmin + ", mallname=" + mallname + ", shop=" + shop
				+ ", department=" + department + "]";
	}
	
	
}

*/