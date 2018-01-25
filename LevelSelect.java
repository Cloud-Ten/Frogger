import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{
    private TextBox button;
    private TextBox button2;
    private TextBox button3;
    private TextBox button4;
    private TextBox back;
    private int carNum = 5;
    private static Car theCar;
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1); 
        Greenfoot.start();
        createBackground();
        prepareHighway();
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
        button = new TextBox(" Easy ", 45, true, Color.WHITE, new Color(0,153,0));
        button2 = new TextBox(" Normal ", 45, true, Color.WHITE, new Color(153, 153, 0));
        button3 = new TextBox(" Hard ", 45, true, Color.WHITE, Color.RED);
        button4 = new TextBox(" Impossible ", 45, true, Color.RED, Color.BLACK);
        TextBox title = new TextBox("   FROGGER   ", 105, true, Color.WHITE, new Color(0,153,0));
        back = new TextBox(" Back ", 45, true, Color.WHITE, Color.RED);
        
        addObject(title, getWidth() / 2, getHeight() / 2 - 150);
        addObject(button, getWidth() / 2 - 225, getHeight() / 2);
        addObject(button2, getWidth() / 2 - 95, getHeight() / 2);
        addObject(button3, getWidth() / 2 + 35, getHeight() / 2);
        addObject(button4, getWidth() / 2 + 195, getHeight() / 2);
        addObject(back, 50, 577);
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
            Greenfoot.setWorld(new Highway(1));
        }
        else if(Greenfoot.mouseClicked(button2))
        {
            Greenfoot.setWorld(new Highway(2));
        }
        else if(Greenfoot.mouseClicked(button3))
        {
            Greenfoot.setWorld(new Highway(3));
        }
        else if(Greenfoot.mouseClicked(button4))
        {
            Greenfoot.setWorld(new Highway(4));
        }
        else if(Greenfoot.mouseClicked(back))
        {
            Greenfoot.setWorld(new TitleScreen());
        }
    }
}
