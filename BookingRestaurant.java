import java.util.ArrayList;
import java.util.List;

public class BookingRestaurant {
	private int id;
	private List<TableRestaurant> reserveTables = new ArrayList<>();
	private String customerName;
	private String contactNumber;
	
	public BookingRestaurant(int id, String customerName, String contactNumber) {
		this.id = id;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
	}
	
	public List<TableRestaurant> getReserveTable(List<TableRestaurant> reserveTables) {
		return reserveTables;
	}
	
	public TableRestaurant setReserveTable(TableRestaurant tb) {
		return tb;
	}
	
	public String toString() {
		return "ID: "+ id +" CustomerName: "+ customerName +" ContactNumuber: "+ contactNumber;
	}
}
