import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Highway extends World
{
    private static Car theCar;
    private static Frog theFrog;
    private int carNum = 1;
    private int carNum2 = 0;
    private int increase = 0;
    private int levelNum = 1;
    /**
     * Constructor for objects of class Road.
     * 
     */
    public Highway(int diff)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1); 
        createBackground();
        prepareHighway();
        
        if(diff == 1)
        {
            theCar.setSpeed(3);
            TextBox difficulty = new TextBox( " Easy ", 40, true, Color.WHITE, new Color(0,153,0));
            addObject(difficulty, 55, 30);
            TextBox level = new TextBox( " Level: " + levelNum + " ", 40, true, Color.WHITE, new Color(0,153,0));
            addObject(level, 880, 30);
        }
        else if(diff == 2)
        {
            theCar.setSpeed(4);
            TextBox level = new TextBox( " Level: " + levelNum + " ", 40, true, Color.WHITE, new Color(0,153,0));
            addObject(level, 880, 30);
            TextBox difficulty = new TextBox( " Normal ", 40, true, Color.WHITE, new Color(153, 153, 0));
            addObject(difficulty, 75, 30);
        }
        else if(diff == 3)
        {
            theCar.setSpeed(5);
            TextBox level = new TextBox( " Level: " + levelNum + " ", 40, true, Color.WHITE, new Color(0,153,0));
            addObject(level, 880, 30);
            TextBox difficulty = new TextBox( " Hard ", 40, true, Color.WHITE, Color.RED );
            addObject(difficulty, 55, 30);
        }
        else
        {
            theCar.setSpeed(7);
            TextBox level = new TextBox( " Level: " + levelNum + " ", 40, true, Color.WHITE, new Color(0,153,0));
            addObject(level, 880, 30);
            TextBox difficulty = new TextBox( " Impossible ", 40, true, Color.RED, Color.BLACK );
            addObject(difficulty, 100, 30);
        }
    }

    private void createBackground()
    {
        getBackground().setColor(new Color(50,205,50));
        getBackground().fillRect( 0, 0, getWidth(), getHeight() );

        getBackground().setColor(new Color(169,169,169));
        getBackground().fillRect( 0, getHeight() / 2 - 230, getWidth(), 200);
        getBackground().fillRect( 0, getHeight() / 2 + 30, getWidth(), 200);

        Greenfoot.start();
    }

    private void prepareHighway()
    {
        theFrog = new Frog();
        addObject(theFrog, getWidth() / 2, 560);
        
        /**
         * traffic going left
         */
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
        
        for(int i = 0; i < carNum2; i++)
        {
            //top
            Car car = new Car();
            addObject(car, Greenfoot.getRandomNumber(1200) / 2, 370);
        }
        
        /**
         * traffic going right
         */
        for(int i = 0; i < carNum2; i++)
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
    }
    
    private void remakeHighway()
    {
        /**
         * traffic going left
         */
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
        
        for(int i = 0; i < carNum2; i++)
        {
            //top
            Car car = new Car();
            addObject(car, Greenfoot.getRandomNumber(1200) / 2, 370);
        }
        
        /**
         * traffic going right
         */
        for(int i = 0; i < carNum2; i++)
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
    }

    public void act()
    {
        changeDifficulty();
    }
    
    private void changeDifficulty()
    {
        if(theFrog.getY() < 50)
        {
            levelNum++;
            increase++;
            carNum = 1 + increase;
            carNum2 = 0 + increase;
            removeObjects(getObjects(Car.class));
            theFrog.setLocation(getWidth() / 2, 560);
            remakeHighway();
            
            TextBox level = new TextBox( " Level: " + levelNum + " ", 40, true, Color.WHITE, new Color(0,153,0));
            removeObject(level);
            addObject(level, 880, 30);
            TextBox three = new TextBox( " 3 ", 50, true, Color.WHITE, new Color(0,153,0) );
            TextBox two = new TextBox( " 2 ", 50, true, Color.WHITE, new Color(0,153,0) );
            TextBox one = new TextBox( " 1 ", 50, true, Color.WHITE, new Color(0,153,0) );
            
            addObject(three, getWidth() / 2, getHeight() / 2);
            Greenfoot.delay(60);
            removeObject(three);
            
            addObject(two, getWidth() / 2, getHeight() / 2);
            Greenfoot.delay(60);
            removeObject(two);
            
            addObject(one, getWidth() / 2, getHeight() / 2);
            Greenfoot.delay(60);
            removeObject(one);
        }
    }
}
