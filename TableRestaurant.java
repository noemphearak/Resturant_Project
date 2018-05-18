
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
	
	
	public int getNumSeat() {
		return numSeat;
	}

	public void setNumSeat(int numSeat) {
		this.numSeat = numSeat;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return "'Table#"+ id+"'"+ "\t" +"'Seats:"+ numSeat+"'"+ "\t\t"+ getOccupled();
	}
}
