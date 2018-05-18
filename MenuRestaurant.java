import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuRestaurant {
	// TODO Create object from each class
	private List<TableRestaurant> listTables = new ArrayList<TableRestaurant>();
	private FoodRestaurant food = new FoodRestaurant();
	private List<FoodRestaurant> listFoods = new ArrayList<FoodRestaurant>();
	private ReservationRestaurant reservation = new ReservationRestaurant();
	private List<ReservationRestaurant> listReservations = new ArrayList<ReservationRestaurant>();
	private OrderRestaurant order = new OrderRestaurant();
	private List<OrderRestaurant> listOrders = new ArrayList<OrderRestaurant>();
	private BookingRestaurant book = new BookingRestaurant();
	private List<BookingRestaurant> listBooks = new ArrayList<BookingRestaurant>();
	private Scanner scanner = new Scanner(System.in);

	// TODO constructor for init what run first in program
	public MenuRestaurant() {

	}

	// TODO Menu restaurant
	public int mainMenu() {
		// Scanner scanner = new Scanner(System.in);
		int inputKey = 0;
		System.out.println("================================ Restaurant Reservation ==============================");
		System.out.println("-----------------------------");
		System.out.println("| 1). New Table		    |");
		System.out.println("| 2). List of Table	    |");
		System.out.println("| 3). New Food		    |");
		System.out.println("| 4). Lists of Foods	    |");
		System.out.println("| 5). Take Reservation	    |");
		System.out.println("| 6). List of Reservation   |");
		System.out.println("| 7). Take Order	    |");
		System.out.println("| 8). List of Order         |");
		System.out.println("| 9). Exit program          |");
		System.out.println("-----------------------------");
		System.out.print("Please choose menu reservation: ");
		inputKey = scanner.nextInt();
		scanner.nextLine();
		System.out.println("You choose menu number: " + inputKey);
		return inputKey;

	}

	// TODO method end menu
	public void endMenu() {
		System.out.println("======================================= Thank you ===================================");

	}

	// TODO error message
	public void errMessage() {
		System.out.println("=================================================");
		System.out.println("| Error**: Invaild number! Please try it again. |");
		System.out.println("=================================================");
	}

	// TODO all method for each function restaurant
	public void createNewTable() {
		int numSeat;
		String id;
		String entered = "";
		System.out.println("==================================== Create New Table ===============================");
		do {
			System.out.print("Enter table No: ");
			id = scanner.nextLine();
			System.out.print("Enter number of Seats: ");
			numSeat = scanner.nextInt();
			scanner.nextLine();
			listTables.add(new TableRestaurant(numSeat, id, false));
			System.out.println("=====================================================================================");
			System.out.print("Do you want to add more table? [Yes/No]: ");
			entered = scanner.nextLine();
		} while (!entered.equals("no"));
		if (entered.equals("no")) {
			System.out.println("Table created!!!");
		}
	}

	public void listAllTable() {
		String continues = "";
		System.out.println("====================================== All Table ====================================");
		if (listTables.size() == 0) {
			System.out.println("===============================================");
			System.out.println("| Warning*: No table! Please create it first. |");
			System.out.println("===============================================");
		} else {
			do {
				System.out.println("[" + "No" + "\t\t" + "Number of Seat" + "\t\t" + "Status" + "]");
				for (TableRestaurant table : listTables) {
					System.out.println(table.toString());
				}
				System.out.println("=====================================================================================");
				System.out.print("Do you want continue to Main Menu?[Yes/No]: ");
				continues = scanner.nextLine();
				if (continues.equals("yes")) {
					mainCall();
				}
			} while (!continues.equals("no"));
			if (continues.equals("no")) {
				System.out.println("======================================== Exited =====================================");
				System.exit(0);
			}
		}
	}

	public void createNewFood() {
		String id = "";
		String name = "";
		double price = 0.0;
		String entered = "";
		System.out.println("==================================== Create New Food ================================");
		do {
			System.out.print("Enter food Id: ");
			id = scanner.nextLine();
			System.out.print("Enter food Name: ");
			name = scanner.nextLine();
			System.out.print("Enter food Price: ");
			price = scanner.nextDouble();
			scanner.nextLine();
			listFoods.add(new FoodRestaurant(id, name, price));
			System.out.println("=====================================================================================");
			System.out.print("Do you want to create more food? [Yes/No]: ");
			entered = scanner.nextLine();
		} while (!entered.equals("no"));
		if (entered.equals("no")) {
			System.out.println("Food created!!!");
		}
	}

	public void listAllNewFood() {
		String continues = "";
		System.out.println("====================================== All Table ====================================");
		if (listFoods.size() == 0) {
			System.out.println("==============================================");
			System.out.println("| Warning*: No food! Please create it first. |");
			System.out.println("==============================================");
		} else {
			do {
				System.out.println("[" + "Code" + "\t\t" + "Food Name" + "\t\t" + "Price" + "]");
				for (FoodRestaurant food : listFoods) {
					System.out.println(food.toString());
				}
				System.out.println("====================================================================================");
				System.out.print("Do you want continue to Main Menu?[Yes/No]: ");
				continues = scanner.nextLine();
				if (continues.equals("yes")) {
					mainCall();
				}
			} while (!continues.equals("no"));
			if (continues.equals("no")) {
				System.out.println("======================================== Exited ======================================");
				System.exit(0);
			}
		}
	}

	public void mainCall() {
		int inputKey = 0;
		secondMenu: while (true) {
			inputKey = mainMenu();
			switch (inputKey) {
			case 1:
				createNewTable();
				break;
			case 2:
				listAllTable();
				break;
			case 3:
				createNewFood();
				break;
			case 4:
				listAllNewFood();
				break;
			case 5:
				takeReservation();
				break;
			case 6:
				listAllReservation();
				break;
			case 7:
				takeOrderFood();
				break;
			case 8:
				listAllOrder();
				break;
			case 9:
				endMenu();
				System.exit(0);
				break;
			default:
				if (inputKey > 9) {
					errMessage();
					continue secondMenu;
				}
			}
		}
	}

	public void takeReservation() {
		int takeKey = 0;
		@SuppressWarnings("unused")
		String entered = "";
		System.out.println("=================================== Take Reservation =================================");
		System.out.println("====================================");
		System.out.println("| 1). Create 2). Update 3). Delete |");
		System.out.println("====================================");
		firstMenu: while (true) {
			System.out.print("Please choose take reservation: ");
			takeKey = scanner.nextInt();
			scanner.nextLine();
			System.out.println("You choose take reservation number: " + takeKey);
			System.out.println("======================================================================================");
			switch (takeKey) {
			case 1:
				reservation.create(book);
				mainCall();
				break;
			case 2:
				reservation.update(book);
				mainCall();
				break;
			case 3:
				reservation.delete(book);
				mainCall();
				break;
			default:
				if (takeKey > 3) {
					errMessage();
					continue firstMenu;
				}
			}
		}
	}

	public void listAllReservation() {
		System.out.println("================================= All Take Reservation ===============================");
		reservation.read(listBooks);
		mainCall();
	}

	public void takeOrderFood() {
		int orderKey = 0;
		@SuppressWarnings("unused")
		String entered = "";
		System.out.println("=================================== Take Reservation =================================");
		System.out.println("====================================");
		System.out.println("| 1). Create 2). Update 3). Delete |");
		System.out.println("====================================");
		firstMenu: while (true) {
			System.out.print("Please choose take order: ");
			orderKey = scanner.nextInt();
			scanner.nextLine();
			System.out.println("You choose take order number: " + orderKey);
			System.out.println("======================================================================================");
			switch (orderKey) {
			case 1:
				order.create(food);
				mainCall();
				break;
			case 2:
				order.update(food);
				mainCall();
				break;
			case 3:
				order.delete(food);
				mainCall();
				break;
			default:
				if (orderKey > 3) {
					errMessage();
					continue firstMenu;
				}
			}
		}
	}

	public void listAllOrder() {
		System.out.println("================================= All Take Order ===============================");
		order.read(listFoods);
		mainCall();
	}
}
