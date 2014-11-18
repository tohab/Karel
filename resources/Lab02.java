import edu.fcps.karel2.Display;

public class Lab02 {
	public static void main(String arg[]) {
		Display.openWorld("resources/maps/maze.map");
		Athlete ath = new Athlete();
		ath.putBeeper();
		ath.move();
		ath.putBeeper();
		ath.turnRight();
		ath.move();
		ath.putBeeper();
		ath.turnRight();
		ath.move();
		ath.putBeeper();
		ath.turnLeft();
		ath.move();
		ath.putBeeper();
		ath.turnLeft();
		ath.move();
		ath.putBeeper();
		ath.turnRight();
		ath.move();
		ath.putBeeper();
		ath.move();
		ath.putBeeper();
		ath.turnRight();
		ath.move();
		ath.putBeeper();
		ath.turnLeft();
		ath.move();
		ath.putBeeper();
		ath.turnLeft();
		ath.move();
		ath.putBeeper();
		ath.move();
		ath.putBeeper();
		ath.move();
		ath.putBeeper();
		ath.move();
		ath.putBeeper();
		ath.turnRight();
		ath.move();
		ath.putBeeper();
	}
}