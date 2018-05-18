import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderRestaurant implements InterfaceRestaurant{
	// TODO Declaration variable
	private int id;
	private TableRestaurant table;
	private List<OrderRestaurant> orderLists = new ArrayList<>();
	private List<FoodRestaurant> foodLists = new ArrayList<FoodRestaurant>();
	private Scanner scanner = new Scanner(System.in);
	
	public OrderRestaurant(int id, TableRestaurant tables) {
		this.id		= id;
		this.table	= tables;
	}

	public OrderRestaurant() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TableRestaurant getTable() {
		return table;
	}

	public void setTable(TableRestaurant table) {
		this.table = table;
	}

	public List<FoodRestaurant> getFoodLists() {
		return foodLists;
	}

	public void setFoodLists(List<FoodRestaurant> foodLists) {
		this.foodLists = foodLists;
	}
	
	public void create(FoodRestaurant create) {
		OrderRestaurant orderRestaurant = new OrderRestaurant();
		String enterd = "";
		do {
			int id 	 = 0;
			int food = 0;
			System.out.print("Enter table number you want to order: ");
			orderRestaurant.setTable(table);
			scanner.nextLine();
			System.out.print("How many food do you want to order?: ");
			food = scanner.nextInt(); 
			scanner.nextLine();
			for (int i = 0; i < food; i++) {
				System.out.print("Enter code you want to eat: ");
				id = scanner.nextInt();
				scanner.nextLine();
			}
			orderLists.add(new OrderRestaurant(id, table));
			System.out.println("======================================================================================");
			System.out.print("Do you want take more order?[yes/no]: ");
			enterd = scanner.nextLine();
		} while (!enterd.equals("no"));
		if (enterd.equals("no")) {
			System.out.println("Created new order!!!");
		}
	}

	public void read(List<FoodRestaurant> listFoods) {
		for (OrderRestaurant or : orderLists) {
			System.out.println(or.toString());
		}
		System.out.println("----------------------------------------------");
		System.out.println("[" + "Code" + "\t\t" + "Food Name" + "\t\t" + "Price" + "]");
		for (FoodRestaurant b : foodLists) {
			System.out.println(b.toString());
		}
	}

	/*public void update(FoodRestaurant update) {
		int id;
		System.out.print("Enter customer Id: ");
		id = scanner.nextInt();
		scanner.nextLine();
		int status = 0, index = 0;
		for (int i = 0; i < foodLists.size(); i++) {
			if (foodLists.get(i).getId() == id) {
				foodLists.toString();
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
			foodLists.set(index, bookingRestaurant);
		}
	}

	public void delete(FoodRestaurant delete) {
		int id = 0;
		int status = 0, index = 0;
		System.out.print("Enter customer Id: ");
		id = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < foodLists.size(); i++) {
			if (foodLists.get(i).getId() == id) {
				foodLists.toString();
				status = 1;
				index = i;
				break;
			}
		}
		if(status ==0) {
			System.out.println("Your id not match!!");
		}
		else {
			foodLists.remove(index);
		}
	}*/

	@Override
	public String toString() {
		return "Order #" + id +"|"+"Table #" + table + "";
	}

	@Override
	public void update(Object T) {
		
	}

	@Override
	public void delete(Object T) {
		
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

}
