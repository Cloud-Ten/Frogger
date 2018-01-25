import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class HelpScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leaderboard2 extends World
{
    private TextBox button;
    private TextBox button2;
    private int offset1 = 430;
    private int offset2 = 290;
    private int offset3 = 90;
    private int offset4 = 40;
    private int offset5 = 200;
    private int offset6 = 400;
    
    /**
     * hard leaderboard config
     */
    private static final String hard1name = "Ron";
    private static final String hard2name = "n/a";
    private static final String hard3name = "n/a";
    private static final String hard4name = "n/a";
    private static final String hard5name = "n/a";
    
    private static final int hard1lvl = 6;
    private static final int hard2lvl = 0;
    private static final int hard3lvl = 0;
    private static final int hard4lvl = 0;
    private static final int hard5lvl = 0;

    /**
     * impossible leaderboard config
     */
    private static final String imp1name = "n/a";
    private static final String imp2name = "n/a";
    private static final String imp3name = "n/a";
    private static final String imp4name = "n/a";
    private static final String imp5name = "n/a";
    
    private static final int imp1lvl = 0;
    private static final int imp2lvl = 0;
    private static final int imp3lvl = 0;
    private static final int imp4lvl = 0;
    private static final int imp5lvl = 0;
    /**
     * Constructor for objects of class HelpScreen.
     * 
     */
    public Leaderboard2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1); 
        createBackground();
    }
    
    private void createBackground()
    {
        getBackground().setColor(new Color(50,205,50));
        getBackground().fillRect( 0, 0, getWidth(), getHeight() );
        
        TextBox textBox1 = new TextBox( " LEADERBOARD ", 50, true, Color.WHITE, new Color(0, 153, 0) );
        addObject(textBox1, getWidth() / 2, getHeight() / 2 - 200);
        TextBox subTitle = new TextBox( " Page 2 of 2 ", 30, true, Color.WHITE, new Color(0,153,0));
        addObject(subTitle, getWidth() / 2, getHeight() / 2 - 150);
        TextBox header1 = new TextBox(" Hard ", 40, true, Color.WHITE, Color.RED);
        addObject(header1, getWidth() / 2 - 220, getHeight() / 2 - 110);
        TextBox header2 = new TextBox(" Impossible ", 40, true, Color.RED, Color.BLACK);
        addObject(header2, getWidth() / 2 + 220, getHeight() / 2 - 110);
        showText("Leaderboard is edited manually", getWidth() / 2, getHeight() / 2 - 250);
        
        /**
         * hard leaderboard
         */
        TextBox textBox2 = new TextBox( " 1 ", 40, true, Color.WHITE, new Color(218,165,32));
        addObject(textBox2, getWidth() / 2 - offset1, getHeight() / 2 - 50);
        TextBox textBox3 = new TextBox( " 2 ", 40, true, Color.WHITE, new Color(169,169,169));
        addObject(textBox3, getWidth() / 2 - offset1, getHeight() / 2);
        TextBox textBox4 = new TextBox( " 3 ", 40, true, Color.WHITE, new Color(205,127,50));
        addObject(textBox4, getWidth() / 2 - offset1, getHeight() / 2 + 50);
        TextBox textBox5 = new TextBox( " 4 ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox5, getWidth() / 2 - offset1, getHeight() / 2 + 100);
        TextBox textBox6 = new TextBox( " 5 ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox6, getWidth() / 2 - offset1, getHeight() / 2 + 150);

        showText(hard1name, getWidth() / 2 - offset2, getHeight() / 2 - 50);
        showText(hard2name, getWidth() / 2 - offset2, getHeight() / 2);
        showText(hard3name, getWidth() / 2 - offset2, getHeight() / 2 + 50);
        showText(hard4name, getWidth() / 2 - offset2, getHeight() / 2 + 100);
        showText(hard5name, getWidth() / 2 - offset2, getHeight() / 2 + 150);
        
        TextBox textBox7 = new TextBox( " Level: " + hard1lvl + " ", 40, true, Color.WHITE, new Color(218,165,32));
        addObject(textBox7, getWidth() / 2 - offset3, getHeight() / 2 - 50);
        TextBox textBox8 = new TextBox( " Level: " + hard2lvl + " ", 40, true, Color.WHITE, new Color(169,169,169));
        addObject(textBox8, getWidth() / 2 - offset3, getHeight() / 2);
        TextBox textBox9 = new TextBox( " Level: " + hard3lvl + " ", 40, true, Color.WHITE, new Color(205,127,50));
        addObject(textBox9, getWidth() / 2 - offset3, getHeight() / 2 + 50);
        TextBox textBox10 = new TextBox( " Level: " + hard4lvl + " ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox10, getWidth() / 2 - offset3, getHeight() / 2 + 100);
        TextBox textBox11 = new TextBox( " Level: " + hard5lvl + " ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox11, getWidth() / 2 - offset3, getHeight() / 2 + 150);
        
        /**
         * impossible leaderboard
         */
        TextBox textBox12 = new TextBox( " 1 ", 40, true, Color.WHITE, new Color(218,165,32));
        addObject(textBox12, getWidth() / 2 + offset4, getHeight() / 2 - 50);
        TextBox textBox13 = new TextBox( " 2 ", 40, true, Color.WHITE, new Color(169,169,169));
        addObject(textBox13, getWidth() / 2 + offset4, getHeight() / 2);
        TextBox textBox14 = new TextBox( " 3 ", 40, true, Color.WHITE, new Color(205,127,50));
        addObject(textBox14, getWidth() / 2 + offset4, getHeight() / 2 + 50);
        TextBox textBox15 = new TextBox( " 4 ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox15, getWidth() / 2 + offset4, getHeight() / 2 + 100);
        TextBox textBox16 = new TextBox( " 5 ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox16, getWidth() / 2 + offset4, getHeight() / 2 + 150);
        
        showText(imp1name, getWidth() / 2 + offset5, getHeight() / 2 - 50);
        showText(imp2name, getWidth() / 2 + offset5, getHeight() / 2);
        showText(imp3name, getWidth() / 2 + offset5, getHeight() / 2 + 50);
        showText(imp4name, getWidth() / 2 + offset5, getHeight() / 2 + 100);
        showText(imp5name, getWidth() / 2 + offset5, getHeight() / 2 + 150);
        
        TextBox textBox17 = new TextBox( " Level: " + imp1lvl + " ", 40, true, Color.WHITE, new Color(218,165,32));
        addObject(textBox17, getWidth() / 2 + offset6, getHeight() / 2 - 50);
        TextBox textBox18 = new TextBox( " Level: " + imp2lvl + " ", 40, true, Color.WHITE, new Color(169,169,169));
        addObject(textBox18, getWidth() / 2 + offset6, getHeight() / 2);
        TextBox textBox19 = new TextBox( " Level: " + imp3lvl + " ", 40, true, Color.WHITE, new Color(205,127,50));
        addObject(textBox19, getWidth() / 2 + offset6, getHeight() / 2 + 50);
        TextBox textBox20 = new TextBox( " Level: " + imp4lvl + " ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox20, getWidth() / 2 + offset6, getHeight() / 2 + 100);
        TextBox textBox21 = new TextBox( " Level: " + imp5lvl + " ", 40, true, Color.WHITE, new Color(0,153,0));
        addObject(textBox21, getWidth() / 2 + offset6, getHeight() / 2 + 150);
        
        button = new TextBox(" Back ", 45, true, Color.WHITE, Color.RED);
        addObject(button, 50, 577);
        button2 = new TextBox("       <       ", 30, true, Color.WHITE, new Color(0,153,0));
        addObject(button2, getWidth() / 2, getHeight() / 2 + 220);
        
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
            Greenfoot.setWorld(new Leaderboard());
        }
    }
}
