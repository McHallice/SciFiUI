package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    
    Space s;
    Crosshair ch;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen(); 
    }

    public void setup()
    {
        
        radar = new Radar(this, 1, 1100,600, 100,width);
        s = new Space(this,0, 5, width, height);
        ch = new Crosshair(this);
    
    }

    Radar radar;

    public void draw()
    {
        radar.update();
        radar.render();

        ch.render();


        
        s.create();

    
       
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

