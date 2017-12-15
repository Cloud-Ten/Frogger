import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class HelpScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpScreen extends World
{
    private TextBox button;
    /**
     * Constructor for objects of class HelpScreen.
     * 
     */
    public HelpScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1); 
        createBackground();
    }
    
    private void createBackground()
    {
        getBackground().setColor(new Color(50,205,50));
        getBackground().fillRect( 0, 0, getWidth(), getHeight() );
        
        TextBox textBox1 = new TextBox( " CONTROLS ", 50, true, Color.WHITE, Color.BLACK );
        addObject(textBox1, getWidth() / 2, getHeight() / 2 - 200);
        TextBox textBox2 = new TextBox( " W ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox2, getWidth() / 2 - 90, getHeight() / 2 - 50);
        TextBox textBox3 = new TextBox( " S ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox3, getWidth() / 2 - 90, getHeight() / 2);
        TextBox textBox4 = new TextBox( " A ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox4, getWidth() / 2 - 90, getHeight() / 2 + 50);
        TextBox textBox5 = new TextBox( " D ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox5, getWidth() / 2 - 90, getHeight() / 2 + 100);
        
        button = new TextBox(" Back ", 45, true, Color.WHITE, Color.RED);
        addObject(button, 50, 577);
        
        showText("- Move forward", getWidth() / 2 + 5, getHeight() / 2 - 50);
        showText("- Move backward", getWidth() / 2 + 14, getHeight() / 2);
        showText("- Move left", getWidth() / 2 - 18, getHeight() / 2 + 50);
        showText("- Move right", getWidth() / 2 - 10, getHeight() / 2 + 100);
        
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
    }
}
