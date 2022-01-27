package technoserve.c2tc.b5.dao;
import technoserve.c2tc.b5.entities.Item;

public interface Itemdao {
	 public void addItem(Item item);
	 public void updateItem(Item item);
		public void deleteItem(int id);
		public Item SearchItem(int id);
	    public void startTransaction();
	    public void EndTransaction();
		
}
