package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    
    Space s;
    Crosshair ch;
     float move = 500;
     float move2 = 750;
     float move3 = 200;
     float move4 = 400;
     float move5 = 525;
     float move6 = 725;
     float speed = 5;
    

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
        ch = new Crosshair(this,move,move2,move3,move4,move5,move6);
        
    
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
           move -= speed;
           move2 -= speed;
           move3 -= speed;
           move4 -= speed;
           move5 -= speed;
           move6 -= speed;

        }
        if (checkKey(RIGHT))
        {
           move -= speed;
           move2 -= speed;
           move3 -= speed;
           move4 -= speed;
           move5 -= speed;
           move6 -= speed;

        }
    }
}

