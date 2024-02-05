package functions;

public class MonthlyTotal extends Command {
	
	
	public MonthlyTotal(String commandName, Params... params) {
		super("monthly_total", params);
	}

	@Override
	public String getInfo() {
		String message="Monthly total explanation....";
		System.out.println(message);
		return message;
	}

	@Override
	public void execute() {
		System.out.println("get the monthly total...");
		
	}

}
