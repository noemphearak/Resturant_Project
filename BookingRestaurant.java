import java.util.ArrayList;
import java.util.List;

public class BookingRestaurant {
	private int id;
	private List<TableRestaurant> reserveTables = new ArrayList<>();
	private String tableRestaurant;
	private String customerName;
	private String contactNumber;
	
	public BookingRestaurant(){}
	
	public BookingRestaurant(int id, String customerName, String contactNumber, String tableRestaurant) {
		this.setId(id);
		this.setCustomerName(customerName);
		this.setContactNumber(contactNumber);
		this.setReserveTables(tableRestaurant);
	}
	
	public String getTableRestaurant() {
		return tableRestaurant;
	}

	public void setTableRestaurant(String tableRestaurant) {
		this.tableRestaurant = tableRestaurant;
	}

	public void setReserveTables(List<TableRestaurant> reserveTables) {
		this.reserveTables = reserveTables;
	}

	public List<TableRestaurant> getReserveTables() {
		return reserveTables;
	}

	public void setReserveTables(String tableRestaurant) {
		this.tableRestaurant =  tableRestaurant;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return"'00" + getId()+"'" + "\t|\t" +"'"+ getCustomerName()+"'" + "\t|\t" +"'"+ getContactNumber()+ "'" + "\t|\t" +"'#"+ getTableRestaurant()+"'";
	}
}
