
/**
 * Write a description of class Rover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rover
{
    // fields
    String name;
    int x;
    int y;
    int dir;// 0=North, 1=East, 2=South, 3=West
    int distance;
    boolean running = true;
    
    public Rover(String name)
    {
        this.name = name;
        this.dir = 0;
    }
    
    
    public void getDirectoryName()
    {
        if (dir == 0)
        {
            System.out.println(name + " is facing North.");
            
        }
        else if (dir == 1)
        {
            System.out.println(name + " is facing North East.");
           
        }
        else if (dir == 2)
        {
            System.out.println(name + " is facing East.");
            
        }
        else if (dir == 3)
        {
            System.out.println(name + " is facing South East.");
           
        }
        else if (dir == 4)
        {
            System.out.println(name + " is facing South.");
            
        }
        else if (dir == 5)
        {
            System.out.println(name + " is facing South West.");
           
        }
        else if (dir == 6)
        {
            System.out.println(name + " is facing West.");
            
        }
        else if (dir == 7)
        {
            System.out.println(name + " is facing North West.");
           
        }
                
    }
    
    public void move()
    {
        getDirectoryName();
    }
    
    public void rotateLeft() 
    {
        getDirectoryName();
        dir -= 1;
        
        if (dir < 0)
        {
            dir = 7;
        }
        
        System.out.println(name + " turned to the left");
        move();
    }
    
    public void rotateRight()
    {
        dir += 1;
        
        if (dir > 7)
        {
            dir = 0;
        }
        
        System.out.println(name + " turned to the right");
        move();
    }
}
