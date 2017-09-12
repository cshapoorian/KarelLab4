
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        checkWall();
        plantBeepers();
    }
    
    public void checkWall() {
        move();
        turnLeft();
        while (nextToABeeper()) {
            turnOff();
        }
        while (frontIsClear()) {
            move();
            turnLeft();
            checkWall();
        }
        while (!frontIsClear()) {
            putBeeper();
            turnRight();
            while (!frontIsClear()) {
                turnRight();
            }
            checkWall();
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

