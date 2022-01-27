package technoserve.c2tc.entities;

import technoserve.c2tc.enu.shop_enum;

public class Shop {
	
	private long sid;
	private String sname;
	private shop_enum Cat;
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public shop_enum getCat() {
		return Cat;
	}
	public void setCat(shop_enum cat) {
		Cat = cat;
	}
	

}
