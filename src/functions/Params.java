package functions;

public enum Params {
	
	COUNTRY("country"),
	COMMODITY("commodity"),
	TRANSPORT_MODE("transport_mode"),
	MEASURE("measure"),
	JANUARY("january"),
	FEBRUARY("february"),
	MARCH("march"),
	APRIL("april"),
	MAY("may"),
	JUNE("june"),
	JULY("july"),
	AUGUST("august"),
	SEPTEMBER("september"),
	OCTOBER("october"),
	NOVEMBER("november"),
	DECEMBER("december"),
	;

	private String name;
	private Params(){
		setName("all");
		
	}
	private Params(String name){
		setName(name);
	}
	public String toString() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}