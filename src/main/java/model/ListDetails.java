package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ListDetails {
	@Id
	@GeneratedValue
	private int id;
	private String listName;
	private LocalDate tripDate;
	@ManyToOne (cascade=CascadeType.PERSIST)
	private Shopper shopper;
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private List<ListItem> listOfItems;

	public ListDetails() {
	}

	public ListDetails(int id, String listName, LocalDate tripDate, Shopper shopper, List<ListItem> listOfItems) {
		setId(id);
		setListName(listName);
		setTripDate(tripDate);
		setShopper(shopper);
		setListOfItems(listOfItems);
	}

	public ListDetails(String listName, LocalDate tripDate, Shopper shopper, List<ListItem> listOfItems) {
		setListName(listName);
		setTripDate(tripDate);
		setShopper(shopper);
		setListOfItems(listOfItems);
	}

	public ListDetails(String listName, LocalDate tripDate, Shopper shopper) {
		setListName(listName);
		setTripDate(tripDate);
		setShopper(shopper);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public LocalDate getTripDate() {
		return tripDate;
	}

	public void setTripDate(LocalDate tripDate) {
		this.tripDate = tripDate;
	}

	public Shopper getShopper() {
		return shopper;
	}

	public void setShopper(Shopper shopper) {
		this.shopper = shopper;
	}

	public List<ListItem> getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(List<ListItem> listOfItems) {
		this.listOfItems = listOfItems;
	}

	@Override
	public String toString() {
		return "ListDetails [id=" + id + ", listName=" + listName + ", tripDate= " + tripDate + ", "
				+ shopper.toString() + listOfItems + "]";
	}
}