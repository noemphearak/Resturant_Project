import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservationRestaurant implements InterfaceRestaurant {
	// TODO Create object list from BookingRestaurant
	BookingRestaurant bookingRestaurant = new BookingRestaurant();
	private List<BookingRestaurant> reservationLists = new ArrayList<BookingRestaurant>();
	private Scanner scanner = new Scanner(System.in);

	public ReservationRestaurant() {}

	public void create(BookingRestaurant create) {
		String enterd = "";
		int reserve = 0;
		do {
			int id = 0;
			String customerName = "";
			String contactNumber = "";
			System.out.print("Enter customer Id: ");
			id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter customer Name: ");
			customerName = scanner.nextLine();
			System.out.print("Enter customer Phone: ");
			contactNumber = scanner.nextLine();
			System.out.print("How many table do you want to book?: ");
			reserve = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < reserve; i++) {
				System.out.print("Enter table do you want to reserve: ");
				bookingRestaurant.setReserveTables(scanner.nextLine());
			}
			reservationLists.add(new BookingRestaurant(id, customerName, contactNumber, bookingRestaurant.getTableRestaurant()));
			System.out.println("======================================================================================");
			System.out.print("Do you want create more?[yes/no]: ");
			enterd = scanner.nextLine();
		} while (!enterd.equals("no"));
		if (enterd.equals("no")) {
			System.out.println("Created new reservation!!!");
		}
	}

	public void read(List<BookingRestaurant> listBooks) {
		System.out.println("[" + "Code" + "\t\t" + "Customer Name" + "\t\t" + "Contact" + "\t\t" + "Table"+ "]");
		for (BookingRestaurant b : reservationLists) {
			System.out.println(b.toString());
		}
	}

	public void update(BookingRestaurant update) {
		int id;
		System.out.print("Enter customer Id: ");
		id = scanner.nextInt();
		scanner.nextLine();
		int status = 0, index = 0;
		for (int i = 0; i < reservationLists.size(); i++) {
			if (reservationLists.get(i).getId() == id) {
				reservationLists.toString();
				status = 1;
				index = i;
				break;
			}
		}
		if (status == 0) {
			System.out.println("Your id not match!!");
		} else {
			BookingRestaurant bookingRestaurant = new BookingRestaurant();
			bookingRestaurant.setId(id);
			System.out.print("Enter customer Name: ");
			bookingRestaurant.setCustomerName(scanner.nextLine());
			System.out.print("Enter customer Phone: ");
			bookingRestaurant.setContactNumber(scanner.nextLine());
			System.out.print("Enter table: ");
			bookingRestaurant.setReserveTables(scanner.nextLine());
			reservationLists.set(index, bookingRestaurant);
		}
	}

	public void delete(BookingRestaurant delete) {
		int id = 0;
		int status = 0, index = 0;
		System.out.print("Enter customer Id: ");
		id = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < reservationLists.size(); i++) {
			if (reservationLists.get(i).getId() == id) {
				reservationLists.toString();
				status = 1;
				index = i;
				break;
			}
		}
		if(status ==0) {
			System.out.println("Your id not match!!");
		}
		else {
			reservationLists.remove(index);
		}
	}
	
	@Override
	public void create(Object T) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public List<Object> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object T) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Object T) {
		// TODO Auto-generated method stub
	}
}
