import java.util.Scanner;

public class MenuRestaurant {
	
	public MenuRestaurant() {
		// Declaration variable as global
		int inputKey = 0;
		Scanner scanner	= new Scanner(System.in);
		
		firstMenu: while(true) {
			mainMenu();
			System.out.print("Please choose menu restaurant: "); inputKey = scanner.nextInt();
			System.out.println("You choose menu number: "+ inputKey);
			switch(inputKey) {
			case 1: 
				break;
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 5: 
				break;
			case 6: 
				break;
			case 7: 
				break;
			case 8: 
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
	
	// Menu restaurant
	public void mainMenu() {
		System.out.println("=============================== Welcome to our Restaurant ===========================");
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
	
	public void endMenu() {
		System.out.println("======================================= Thank you ===================================");
	}
	
	public void errMessage() {
		System.out.println("=================================================");
		System.out.println("| Error**: Invaild number! Please try it again. |");
		System.out.println("=================================================");
	}
}
