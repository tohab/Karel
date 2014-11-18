import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab00 {
	public static void main(String arg[]) {
		Display.openWorld("resources/maps/first.map");
		Display.setSize(10, 10);
		Display.setSpeed(5);
		
		Robot karel = new Robot();
		
		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
	}
}