import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuRestaurant {
	// TODO Create object from each class
	private List<TableRestaurant> listTables 	= new ArrayList<TableRestaurant>();
	private List<FoodRestaurant>  listFoods		= new ArrayList<FoodRestaurant>();
	private List<ReservationRestaurant> listReservations	= new ArrayList<ReservationRestaurant>();
	private List<OrderRestaurant> listOrders	= new ArrayList<OrderRestaurant>();
	private Scanner scanner						= new Scanner(System.in);
	
	// TODO constructor for init what run first in program
	public MenuRestaurant() {
		int inputKey = 0;
		Scanner scanner	= new Scanner(System.in);
		
		firstMenu: while(true) {
			mainMenu();
			System.out.print("Please choose menu restaurant: "); inputKey = scanner.nextInt();
			System.out.println("You choose menu number: "+ inputKey);
			switch(inputKey) {
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
				if(inputKey > 9) {
					errMessage();
					continue firstMenu;
				}
			}
		}
	}
	
	// TODO Menu restaurant
	public void mainMenu() {
		System.out.println("================================ Restaurant Reservation =============================");
        System.out.println("1). New Table ");
        System.out.println("2). List of Table");
        System.out.println("3). New Food");
        System.out.println("4). Lists of Foods");
        System.out.println("5). Take Reservation");
        System.out.println("6). List of Reservation");
        System.out.println("7). Take Order");
        System.out.println("8). List of Order");
        System.out.println("9). Exit program");
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
		String enterd = "";
		System.out.println("==================================== Create New Table ===============================");
		do {
			System.out.print("Enter table No: "); id = scanner.nextLine();
			System.out.print("Enter number of Seats: "); numSeat = scanner.nextInt(); scanner.nextLine();
			listTables.add(new TableRestaurant(numSeat, id, false));
			System.out.println("=====================================================================================");
			System.out.print("Do you want to add more table? [Yes/No]: "); enterd = scanner.nextLine();
		}while(!enterd.equals("no"));
		if(enterd.equals("no")) {
			System.out.println("Table created!!!");
		}
	}
	
	public void listAllTable() {
		String continues = "";
		System.out.println("====================================== All Table ====================================");
		if(listTables.size() == 0) {
			System.out.println("===============================================");
			System.out.println("| Warning*: No table! Please create it first. |");
			System.out.println("===============================================");
		}else {
			do {
				System.out.println("["+ "No"+ "\t\t"+ "Number of Seat"+ "\t\t"+ "Status"+"]");
				for(TableRestaurant table : listTables) {
					System.out.println(table.toString());
				}
				System.out.println("=====================================================================================");
				System.out.print("Do you want continue to Main Menu?[Yes/No]: "); continues = scanner.nextLine();
				if(continues.equals("yes")) {
					new MenuRestaurant();
				}
			}while(!continues.equals("no"));
			if(continues.equals("no")) {
				System.out.println("======================================== Exited =====================================");
				System.exit(0);
			}
		}
	}

	public void createNewFood() {
		String id		= "";
		String name		= "";
		double price 	= 0.0;
		String enterd 	= "";
		System.out.println("==================================== Create New Food ================================");
		do {
			System.out.print("Enter food Id: "); id = scanner.nextLine();
			System.out.print("Enter food Name: "); name = scanner.nextLine();
			System.out.print("Enter food Price: "); price = scanner.nextDouble();scanner.nextLine();
			listFoods.add(new FoodRestaurant(id, name, price));
			System.out.println("=====================================================================================");
			System.out.print("Do you want to create more food? [Yes/No]: "); enterd = scanner.nextLine();
		}while(!enterd.equals("no"));
		if(enterd.equals("no")) {
			System.out.println("Food created!!!");
		}
	}
	
	public void listAllNewFood() {
		String continues = "";
		System.out.println("====================================== All Table ====================================");
		if(listFoods.size() == 0) {
			System.out.println("==============================================");
			System.out.println("| Warning*: No food! Please create it first. |");
			System.out.println("==============================================");
		}else {
			do {
				System.out.println("["+ "Code"+ "\t\t"+ "Food Name"+ "\t\t"+ "Price"+"]");
				for(FoodRestaurant food : listFoods) {
					System.out.println(food.toString());
				}
				System.out.println("=====================================================================================");
				System.out.print("Do you want continue to Main Menu?[Yes/No]: "); continues = scanner.nextLine();
				if(continues.equals("yes")) {
					new MenuRestaurant();
				}
			}while(!continues.equals("no"));
			if(continues.equals("no")) {
				System.out.println("======================================== Exited =====================================");
				System.exit(0);
			}
		}
	}
	
	public void takeReservation() {
		
	}
	
	public void listAllReservation() {
		
	}
	
	public void takeOrderFood() {
		
	}

	public void listAllOrder() {
		
	}
}
