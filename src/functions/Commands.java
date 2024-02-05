package functions;

public enum Commands {
	MONTHLY_TOTAL("monthly_total"),
	OVERVIEW("overview"),
	MONTHLY_AVERAGE("monthly_average"),
	YEARLY_TOTAL("yearly_total"),
	YEARLY_AVERAGE("yearly_average"),
	HELP("help")
	;
	
	private String name;
	
	Commands(String command) {
		this.name=command;
	}
	public String toString() {
		return this.name;
	}
}
