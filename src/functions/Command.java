package functions;

public abstract class Command {
	private String commandName;
	private Commands command;
	private Params param1,
				   param2;
	public Command(String commandName,Params... params) {
		setCommandName(commandName);
		setParams(params);
	}
	public String getCommandName() {
		return commandName;
	}
	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}
	public Params[] getParams() {
		Params[] params= {param1,param2};
		return params;
	}
	public void setParams(Params...params) {
		if(params!=null) {
			if(params.length>0) {
				param1=params[0];
				if(params.length>1) {
					param2=params[1];
				}
			}
		}
	}
	
	public abstract String getInfo();
	public abstract void execute();
}
