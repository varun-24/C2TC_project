package technoserve.c2tc.b5.service;

import technoserve.c2tc.b5.dao.ItemDaoImplementation;
import technoserve.c2tc.b5.dao.Itemdao;
import technoserve.c2tc.b5.entities.Item;

public class ItemServiceImplementation implements ItemService {
	Itemdao itd;
	
	

	public ItemServiceImplementation() {
		itd=new ItemDaoImplementation();
	}

	@Override
	public void addItem(Item item) {
		itd.startTransaction();
		itd.addItem(item);
		itd.EndTransaction();
		
	}

	@Override
	public void updateItem(Item item) {
		itd.startTransaction();
		itd.updateItem(item);
		itd.EndTransaction();
		
	}
	@Override
	public void deleteItem(int id) {
		itd.startTransaction();
		itd.deleteItem(id);
		itd.EndTransaction();
	}

	@Override
	public Item SearchItem(int id) {
		Item item=itd.SearchItem(id);
		return item;
		
	}

}
