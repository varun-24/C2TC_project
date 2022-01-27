package technoserve.c2tc.b5.entities;


	
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.OneToMany;

	@Entity
	public class Customer {
		@Id
		private long id;
		private String customername;
		private long phno;
		private String email;
		@OneToMany(cascade = CascadeType.ALL)
		private List<Order_details> orderdetails;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getCustomername() {
			return customername;
		}
		public void setCustomername(String customername) {
			this.customername = customername;
		}
		public long getPhno() {
			return phno;
		}
		public void setPhno(long phno) {
			this.phno = phno;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public List<Order_details> getOrderdetails() {
			return orderdetails;
		}
		public void setOrderdetails(List<Order_details> orderdetails) {
			this.orderdetails = orderdetails;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", customername=" + customername + ", phno=" + phno + ", email=" + email
					+ ", orderdetails=" + orderdetails + "]";
		}
		
		
	}
	
