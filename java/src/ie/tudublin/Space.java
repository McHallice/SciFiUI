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
ui.rect(x,x,width, height);
ui.fill(255);
ui.noStroke();
ui.ellipse(ui.random(width), ui.random(height),2,2);




}








}