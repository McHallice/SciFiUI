package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    
    Space s;

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
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(P3D); 
    }

    public void setup()
    {
       
        radar = new Radar(this, 1, width / 2, height / 2, 100);
        s = new Space(this,0, 2, width, height);
    }

    Radar radar;

    public void draw()
    {
        
        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

