package functions;

import java.util.Arrays;
import java.util.List;

public class CommandHandler {
	
	public CommandHandler() {
		
	}
	public void handle(String command) {
		
	}
	public boolean isValidCommand(String command) {
		List<Commands>list=Arrays.asList(Commands.values());
		return list.contains(command);	
		
	}
}
