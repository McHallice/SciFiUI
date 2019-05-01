package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar
{
    private float radius;
    private PVector pos;
    private float frequency;
    private UI ui;
    private float theta = 0;
    private float width;
   
    public Radar(UI ui, float frequency, float x, float y, float radius, float width)
    {
        this.ui = ui;
        this.frequency = frequency;
        pos = new PVector(x, y);
        this.radius = radius;
        this.width = width;
        
    }

    public void render()
    {
        /*ui.pushMatrix();        
        ui.noFill();
        ui.stroke(0, 200, 0);
        ui.translate(pos.x, pos.y);
        ui.rotate(theta);
        ui.ellipse(0, 0, radius * 2, radius * 2);
        ui.line(0,0,0,-radius);
        ui.popMatrix();
        */

       
        ui.fill(105,105,105);
        ui.rect(0,475, width,800);
        ui.stroke(0,255,0);
        ui.fill(0,0,0);
        ui.ellipse(pos.x, pos.y, radius * 2, radius * 2);
        float x2 = pos.x + (float) Math.sin(theta) * radius;
        float y2 = pos.y - (float) Math.cos(theta) * radius;
        ui.line(pos.x, pos.y, x2, y2);
    }

    float timeDelta = 1.0f / 60.0f;

    public void update()
    {
        theta += PApplet.TWO_PI * timeDelta * frequency;
    }
}
