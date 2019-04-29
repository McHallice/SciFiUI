package ie.tudublin;

import processing.core.PApplet;

public class Space
{
    private float x;
    private float y;
    private float height;
    private float width;
    UI ui;

public Space(UI ui,float x, float y, float height, float width){
    
this.ui = ui;
this.x = x;
this.y = y;
this.height = height;
this.width = width;




}
public void create(){

    ui.fill (x,y);
    ui.stroke(0,0,0);
    ui.rect(x,x,height,width);
    ui.fill(255);
    ui.noStroke();
    ui.ellipse(ui.random(height), ui.random(width),2,3);
    
}
    
    






}