
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    int x = 0;
    
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        for (int i = 0; i < 9; i++) {
           checkRow();
       }
    }
    
    public void checkRow() {
        move();
        turnLeft();
        while (nextToABeeper()) {
            pickBeeper();
            move();
            x++;
        }
        flip();
        for (int i = x; i > 0; i--) {
            move();
        }
        turnLeft();
        x = 0;
        
    }
    
    public void flip() {
        turnLeft();
        turnLeft();
    }
    
   
}