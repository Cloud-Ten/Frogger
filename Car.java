import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private static int speed = 0;
    
    
    public Car()
    {
        getImage().scale(80, 40);
    }
    
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkCollision();
        move(speed);
    }    
    
    private void checkCollision()
    {
        if(getX() >= 945)
        {
            setLocation(5, getY());
        }
        
        if(getX() <= 0)
        {
            setLocation(945, getY());
        }
    }
    
    public void setSpeed(int s)
    {
        speed = s;
    }
}
