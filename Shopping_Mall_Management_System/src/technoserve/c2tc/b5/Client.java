package technoserve.c2tc.b5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale.Category;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import technoserve.c2tc.b5.entities.Customer;
//import technoserve.c2tc.b5.entities.Customer;
import technoserve.c2tc.b5.entities.Employee;

import technoserve.c2tc.b5.entities.Order_details;
//import technoserve.c2tc.b5.entities.Mall;
import technoserve.c2tc.b5.entities.Shop;
import technoserve.c2tc.b5.enu.dept;
import technoserve.c2tc.b5.enu.item_category;
import technoserve.c2tc.b5.enu.lease_status;
import technoserve.c2tc.b5.enu.shop_category;
import technoserve.c2tc.b5.service.EmployeeService;
import technoserve.c2tc.b5.service.EmployeeServiceImplementation;
import technoserve.c2tc.b5.service.ItemService;
import technoserve.c2tc.b5.service.ItemServiceImplementation;
import technoserve.c2tc.b5.service.MallService;

//import technoserve.c2tc.b5.entities.User;
import technoserve.c2tc.b5.service.ShopService;
import technoserve.c2tc.b5.service.ShopServiceImpl;

public class Client {

	public static void main(String[] args) throws ParseException {
		
        String str3="24-11-1999";
        String str4="31-12-2000";
        SimpleDateFormat format1= new SimpleDateFormat("dd-MM-yyyy");
        Date date3=format1.parse(str3);
        Date date4=format1.parse(str4);
	
        Shop shop = new Shop();
        technoserve.c2tc.b5.entities.Item item=new technoserve.c2tc.b5.entities.Item();
        technoserve.c2tc.b5.entities.Item item1 = new technoserve.c2tc.b5.entities.Item();
        technoserve.c2tc.b5.entities.Item item2 = new technoserve.c2tc.b5.entities.Item();
        technoserve.c2tc.b5.entities.Item item3 = new technoserve.c2tc.b5.entities.Item();
        Employee empl = new Employee();
        Employee empl1 = new Employee();
        Employee empl2 = new Employee();
        Employee empl3 = new Employee();


        ShopService SS = new ShopServiceImpl();
        ItemService IS = new ItemServiceImplementation();
        EmployeeService El = new EmployeeServiceImplementation();


        shop.setSid(10);
        shop.setSname("Tv Store");
        shop.setCat(shop_category.REATIL);
        shop.setLease(lease_status.NO);

        empl.setId(1);
        empl.setAddress("Kormanagala");
        empl.setDesignation("Manager");
        empl.setName("Varun");
        empl.setShop("Tv Store");
empl.setSalary(120000);
empl.setDob(date3);

empl1.setId(2);
empl1.setAddress("Nelamanagala");
empl1.setDesignation("CEO");
empl1.setName("Kishore");
empl1.setShop("Tv store");

empl2.setId(3);
empl2.setAddress("MG Road");
empl2.setDesignation(" Senior Manager");
empl2.setName("Fiza");
empl2.setShop("Tv Store");

empl3.setId(4);
empl3.setAddress("Nelamanagala");
empl3.setDesignation("CEO");
empl3.setName("Kishore");
empl3.setShop("Tv store");

shop.getShopEmployee().add(empl);
shop.getShopEmployee().add(empl1);
shop.getShopEmployee().add(empl2);
shop.getShopEmployee().add(empl3);

String str1="01-01-1999";
String str2="31-12-2000";
SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
Date date1=format.parse(str1);
Date date2=format.parse(str2);

item.setCate(item_category.SHOES);
item.setExpiry(date2);
item.setId(12345);
item.setManufacturing(date1);
item.setName("dgfhy");
item.setPrice(1234);

item1.setCate(item_category.CLOTHES);
item1.setExpiry(date1);
item1.setId(78954);
item1.setManufacturing(date2);
item1.setName("Reebok");
item1.setPrice(1999);

shop.getItem().add(item);
shop.getItem().add(item1);

SS.addShop(shop);





	     
	     
	     
	     
	     
	     
	    
		
	}

}
