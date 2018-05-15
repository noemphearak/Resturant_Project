import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuRestaurant {
	// TODO Create object from each class
	private List<TableRestaurant> listTables 	= new ArrayList<TableRestaurant>();
	private List<FoodRestaurant>  listFoods		= new ArrayList<FoodRestaurant>();
	private ReservationRestaurant	reservation	= new ReservationRestaurant();
	private List<ReservationRestaurant> listReservations	= new ArrayList<ReservationRestaurant>();
	private List<OrderRestaurant> listOrders	= new ArrayList<OrderRestaurant>();
	
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
		
	}
	
	public void listAllTable() {
		
	}

	public void createNewFood() {
		
	}
	
	public void listAllNewFood() {
		
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
