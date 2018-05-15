
public class TableRestaurant {
	private int numSeat;
	private String id;
	boolean available;
	
	public TableRestaurant(int numSeat, String id, boolean available) {
		this.numSeat	= numSeat;
		this.id			= id;
		this.available	= available;
	}
	
	public void setOccupled(boolean busy) {
		this.available	= busy;
	}
	
	public boolean getOccupled() {
		return true;
	}
	
	public String toString() {
		return "'Table#"+ id+"'"+ "\t" +"'Seats:"+ numSeat+"'"+ "\t\t"+ getOccupled();
	}
}
