package functions;

public class Help extends Command {
	
	private Commands command;
	private String[] params;
	private byte label=0;
	public Help() {
		super("help",null);
	}
	public Help(Params... params) {
		super("help",params);
	}
	@Override
	public void execute() {
		if (command==null) {
			System.out.println("SHOW ALL help info ");
		}else {
			System.out.println("");
		}
	}
	@Override
	public String getInfo() {
		System.out.println("SHOW ALL help info ");
		System.out.println("monthly, yearly, overview,etc....");
		return null;
	}
	public String getinfo(Command command) {
		
		if(command!=null) {
			System.out.println("@Help:getInfo()");
			System.out.println("SHOW help about"+command.getInfo());
			
			return command.getInfo();
		}else {
			System.out.println("Invalid parameter @Help:getInfo(), the Command is null");
			return null;
		}

	}
	

}
