import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

public class Move {
	public static void move(int x, int y) throws AWTException{
	    Robot bot = new Robot();
	    bot.mouseMove(x, y);
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("Move Mouse Started");
		String arg1 = args[0]; //totalMinutes
		String arg2 = args[1]; //interval
		
		System.out.println("arg1..="+arg1+"    arg2..:"+arg2);
		int totalMinutes = Integer.parseInt(arg1);
		int interval = Integer.parseInt(arg2);
		for (int i = 0; i < totalMinutes; i++) {
			move(100,100);
			TimeUnit.MINUTES.sleep(interval);
			System.out.println("Loop...:"+ (i+1));
		}
	}
}
