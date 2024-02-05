package functions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean isRunning=true;
		CommandHandler handler=new CommandHandler();
		Scanner sc=new Scanner(System.in);
		String command;
		try {
			while(isRunning) {
				System.out.println("Enter a command");
				System.out.print(System.getProperty("user.dir")+">");
				command=sc.nextLine();
				if(isRunning=!command.toLowerCase().equals("exit")) {
					handler.handle(command);
					System.out.println("running");
					System.out.println("january".equals(Months.JANUARY.name().toLowerCase()));
				}
			}
			System.out.println("Goodbye");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(sc!=null) {
				sc.close();
			}
			sc.close();
		}
		
	}

}
