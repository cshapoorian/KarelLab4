
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        move();
        move();
        go();
    }
    
    public void go() {
        while (!frontIsClear()) {
            turnRight();
        }
        checkSpace();
        go();
    }
    
    public void checkSpace() {
        while (frontIsClear()) {
            move();
            turnLeft();
            while (frontIsClear()) {
                move();
                turnOff();
            }
            turnRight();
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

