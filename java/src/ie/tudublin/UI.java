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
<<<<<<< HEAD
        
        radar = new Radar(this, 1, 1100,600, 100,width);
        s = new Space(this,0, 5, width, height);
        ch = new Crosshair(this);
    
=======
       
        radar = new Radar(this, 1, 1100,600, 100,width);
        s = new Space(this,0, 2, width, height);
>>>>>>> de7e8069b669c806897000ef5780b728090c9d9f
    }

    Radar radar;

    public void draw()
    {
<<<<<<< HEAD
        radar.update();
        radar.render();

        ch.render();


        
        s.create();
=======
        s.create();
        radar.update();
        radar.render();
>>>>>>> de7e8069b669c806897000ef5780b728090c9d9f

    
       
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

