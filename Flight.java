
public class Flight {

	private String flightNum;
	private String from;
	private String to;
	private int duration;
	private int transfers;
	
	/**
	 * Creates a new flight
	 * @param flightNum
	 * @param from
	 * @param to
	 * @param duration
	 * @param transfers
	 */
	public Flight(String flightNum, String from, String to, int duration, int transfers) {
		this.flightNum = flightNum;
		this.from = from;
		this.to = to;
		this.duration = duration;
		this.transfers = transfers;
	}
	
	/**
	 * return where the plan is coming from
	 * @return from
	 */
	public String getFrom() {
		return this.from;
	}
	
	/**
	 * return the destination of the flight
	 * @return to
	 */
	public String getTo() {
		return this.to;
	}
	
	/**
	 * return the duration of the flight
	 * @return duration
	 */
	public int getDuration() {
		return this.duration;
	}

	/**
	 * returns the number of transfers
	 * @return transfers
	 */
	public int getNumTransfers() {
		return this.transfers;
	}
	
	/**
	 * puts flight information into a string
	 * @return a String of each flights information
	 */
	public String toString() {
		return "Flight Number: " +  this.flightNum + "\nFrom: " + this.getFrom() + "\nTo: "
				+ this.getTo() + "\nDuration: " + this.getDuration() + this.printTransfers();
	}
	
	/**
	 * puts the number of transfers into a string to display correctly
	 * @return String containing the transfer information
	 */
	private String printTransfers() {
		if(this.getNumTransfers() == 0) {
			return "\nDirect Flight";
		}
		if(this.getNumTransfers() == 1) {
			return "\n1 Transfer";
		}
		else {
			return "\n" + this.getNumTransfers() + " Transfers";
		}
			
	}
}
