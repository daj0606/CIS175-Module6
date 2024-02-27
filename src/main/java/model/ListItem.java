package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// was going to try to fix "@GeneratedValue" because it is auto generating values by adding 50 to the current id (1, 51, 101, 151)
// I realized it would be complicated though and I do not believe that it is going to break anything. But would be good to know how to fix in future

@Entity
@Table(name="shoppinglist")
public class ListItem {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	
	public ListItem() {
		super();
	}
	
	public ListItem(String store, String item) {
		super();
		this.store = store;
		this.item = item;
	}
	
	public String returnItemDetails() {
		return this.store + ":" + this.item;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", store=" +
		store + ", item=" + item + "]";
	}
}
