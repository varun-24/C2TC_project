package technoserve.c2tc.b5.service;


import technoserve.c2tc.b5.entities.Item;

public interface ItemService {

	public void addItem(Item item);
    public void updateItem(Item item);
	public void deleteItem(int id);
	public Item SearchItem(int id);
}