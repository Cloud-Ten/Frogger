import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * FROGGER
 * 
 * @author (Ron Nguyen) 
 * @version (1.0)
 */
public class TitleScreen extends World
{
    private TextBox button;
    private TextBox button2;
    private TextBox button3;
    private TextBox button4;
    private int carNum = 5;
    private static Car theCar;
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1); 
        createBackground();
        prepareHighway();
        Greenfoot.start();
    }
    
    private void createBackground()
    {
        getBackground().setColor(new Color(50,205,50));
        getBackground().fillRect( 0, 0, getWidth(), getHeight() );

        getBackground().setColor(new Color(169,169,169));
        getBackground().fillRect( 0, getHeight() / 2 - 230, getWidth(), 200);
        getBackground().fillRect( 0, getHeight() / 2 + 30, getWidth(), 200);
    }
    
    private void prepareHighway()
    {
        //traffic going left
        for(int i = 0; i < carNum; i++)
        {
            //bottom
            Car car = new Car();
            addObject(car, Greenfoot.getRandomNumber(1500) / 2, 500);
        }
        
        for(int i = 0; i < carNum; i++)
        {
            //middle
            Car car = new Car();
            addObject(car, Greenfoot.getRandomNumber(1800) / 2, 435);
        }
        
        for(int i = 0; i < carNum; i++)
        {
            //top
            Car car = new Car();
            addObject(car, Greenfoot.getRandomNumber(1200) / 2, 370);
        }
        
        //traffic going right
        for(int i = 0; i < carNum; i++)
        {
            //bottom
            theCar = new Car();
            theCar.setRotation(180);
            addObject(theCar, Greenfoot.getRandomNumber(1600) / 2, 240);
        }
        
        for(int i = 0; i < carNum; i++)
        {
            //middle
            theCar = new Car();
            theCar.setRotation(180);
            addObject(theCar, Greenfoot.getRandomNumber(1900) / 2, 180);
        }
        
        for(int i = 0; i < carNum; i++)
        {
            //top
            theCar = new Car();
            theCar.setRotation(180);
            addObject(theCar, Greenfoot.getRandomNumber(1400) / 2, 110);
        }
        button = new TextBox(" Start ", 45, true, Color.WHITE, new Color(0,153,0));
        button2 = new TextBox(" Help ", 45, true, Color.WHITE, new Color(0,153,0));
        button3 = new TextBox(" Leaderboard ", 45, true, Color.WHITE, new Color(0,153,0));
        button4 = new TextBox("   v1.1   ", 35, true, Color.WHITE, new Color(0,153,0));
        TextBox title = new TextBox("   FROGGER   ", 105, true, Color.WHITE, new Color(0,153,0));
        
        addObject(title, getWidth() / 2, getHeight() / 2 - 150);
        addObject(button, getWidth() / 2 - 170, getHeight() / 2);
        addObject(button2, getWidth() / 2 + 170, getHeight() / 2);
        addObject(button3, getWidth() / 2, getHeight() / 2);
        addObject(button4, getWidth() / 2, getHeight() / 2 + 270);
    }
    
    public void act()
    {
        theCar.setSpeed(5);
        checkMouse();
    }
    
    private void checkMouse()
    {
        if(Greenfoot.mouseClicked(button))
        {
            Greenfoot.setWorld(new LevelSelect());
        }
        
        if(Greenfoot.mouseClicked(button2))
        {
            Greenfoot.setWorld(new HelpScreen());
        }
        
        if(Greenfoot.mouseClicked(button3))
        {
            Greenfoot.setWorld(new Leaderboard());
        }
        
        if(Greenfoot.mouseClicked(button4))
        {
            Greenfoot.setWorld(new Changelog());
        }
    }
}
