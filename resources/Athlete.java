import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Athlete extends Robot {
	public Athlete() {
		super(1,1, Display.NORTH, Display.INFINITY);
	}
	public Athlete (int x, int y, int dir, int beep) {
		super(x,y,dir,beep);
	}
	public void turnAround() {
		this.turnLeft();
		this.turnLeft();
	}
	public void turnRight() {
		this.turnLeft();
		this.turnLeft();
		this.turnLeft();
	}
 }
