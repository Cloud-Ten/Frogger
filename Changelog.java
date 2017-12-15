import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class HelpScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Changelog extends World
{
    private TextBox button;
    private TextBox button2;
    /**
     * Constructor for objects of class HelpScreen.
     * 
     */
    public Changelog()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1); 
        createBackground();
    }
    
    private void createBackground()
    {
        getBackground().setColor(new Color(50,205,50));
        getBackground().fillRect( 0, 0, getWidth(), getHeight() );
        
        TextBox textBox1 = new TextBox( " CHANGELOG ", 50, true, Color.WHITE, Color.BLACK );
        addObject(textBox1, getWidth() / 2, getHeight() / 2 - 200);
        TextBox subTitle = new TextBox( " Version: 1.0.8 ", 30, true, Color.WHITE, new Color(0,153,0));
        addObject(subTitle, getWidth() / 2, getHeight() / 2 - 150);

        showText("- Removed lots of unnessecary code", getWidth() / 2, getHeight() / 2 - 50);
        showText("- Difficulty select refined a bit more", getWidth() / 2, getHeight() / 2);
        showText("- Difficulties have been changed a bit", getWidth() / 2, getHeight() / 2 + 50);
        
        button = new TextBox(" Back ", 45, true, Color.WHITE, Color.RED);
        addObject(button, 50, 577);
        button2 = new TextBox(" Previous version ", 30, true, Color.WHITE, new Color(0,153,0));
        addObject(button2, getWidth() / 2, getHeight() / 2 + 200);
        
        Greenfoot.start();
    }
    
    public void act()
    {
        checkMouse();
    }
    
    private void checkMouse()
    {
        if(Greenfoot.mouseClicked(button))
        {
            Greenfoot.setWorld(new TitleScreen());
        }
        
        if(Greenfoot.mouseClicked(button2))
        {
            Greenfoot.setWorld(new ChangelogPrev());
        }
    }
}
