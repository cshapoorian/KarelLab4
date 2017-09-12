 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        turnLeft();
        move();
        turnRight();
        move();
        turnLeft();
        go();
    }
    
    public void go() {
        while (!frontIsClear()) {
            turnRight();
        }
        move();
        checkSpace();
        go();
    }
    
    public void checkSpace() {
            turnLeft();  
            if (nextToABeeper()) {
                 turnOff();
            }
            if (frontIsClear()) {
                putBeeper();
                turnRight();
            }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
   
}

