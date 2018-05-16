import java.util.ArrayList;
import java.util.List;

public interface InterfaceRestaurant {
	public void create(FoodRestaurant food);
	public void read(List<FoodRestaurant> foodLists);
	public void update(FoodRestaurant update);
	public void delete(FoodRestaurant delete);
	public void create(BookingRestaurant add);
	public void read(ArrayList<BookingRestaurant> bookLists);
	public void update(BookingRestaurant update);
	public void delete(BookingRestaurant delete);
}
