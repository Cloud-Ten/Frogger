import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    private String upKey;
    private String downKey;
    private String leftKey;
    private String rightKey;
    private TextBox button;
    private boolean gameOver;
    public Frog()
    {
        getImage().scale(40, 40);
        upKey = "w";
        downKey = "s";
        leftKey = "a";
        rightKey = "d";
    }
    
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkKeyPress();
        checkCollision();
    }    
    
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown(upKey) == true)
        {
            setLocation( getX(), getY() - 4 );
        }
        
        if(Greenfoot.isKeyDown(downKey) == true)
        {
            setLocation( getX(), getY() + 4 );
        }
        
        if(Greenfoot.isKeyDown(leftKey) == true)
        {
            setLocation( getX() - 2, getY() );
        }
        
        if(Greenfoot.isKeyDown(rightKey) == true)
        {
            setLocation( getX() + 2, getY() );
        }
        
        if(Greenfoot.isKeyDown("space") == true)
        {
            if(gameOver == true)
            {
                Greenfoot.setWorld(new TitleScreen());
            }
        }
    }
    
    private void checkCollision()
    {
        Car car = (Car)getOneIntersectingObject(Car.class);
        
        if(car != null)
        {
            TextBox textBox1 = new TextBox( " GAME OVER ", 50, true, Color.WHITE, Color.BLACK );
            TextBox button = new TextBox( " Press SPACE to return to menu ", 25, true, Color.WHITE, new Color(0,153,0) );
            
            getWorld().addObject(textBox1, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            getWorld().addObject(button, getWorld().getWidth() / 2, getWorld().getHeight() / 2 + 35);
            
            setImage("deadfrog.png");
            getImage().scale(40, 40);
            
            gameOver = true;
            
            upKey = "0";
            downKey = "0";
            leftKey = "0";
            rightKey = "0";
        }
    }
}

