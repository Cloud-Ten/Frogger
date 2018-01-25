import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class HelpScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChangelogPrev extends World
{
    private TextBox button;
    /**
     * Constructor for objects of class HelpScreen.
     * 
     */
    public ChangelogPrev()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1); 
        createBackground();
    }
    
    private void createBackground()
    {
        getBackground().setColor(new Color(50,205,50));
        getBackground().fillRect( 0, 0, getWidth(), getHeight() );
        
        TextBox textBox1 = new TextBox( " CHANGELOG ", 50, true, Color.WHITE, new Color(0, 153, 0) );
        addObject(textBox1, getWidth() / 2, getHeight() / 2 - 200);
        TextBox subTitle = new TextBox( " Version: 1.0.6 ", 30, true, Color.WHITE, new Color(0,153,0));
        addObject(subTitle, getWidth() / 2, getHeight() / 2 - 150);

        showText("- Refined UI a bit", getWidth() / 2, getHeight() / 2 - 50);
        //showText("- Made impossible difficulty more impossible", getWidth() / 2, getHeight() / 2);
        //showText("- Removed unnessecary code", getWidth() / 2, getHeight() / 2 + 50);
        
        button = new TextBox(" Back ", 45, true, Color.WHITE, Color.RED);
        addObject(button, 50, 577);
        
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
            Greenfoot.setWorld(new Changelog());
        }
    }
}
