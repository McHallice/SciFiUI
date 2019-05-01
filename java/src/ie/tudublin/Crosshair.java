package ie.tudublin;

import processing.core.PApplet;



public class Crosshair{

    private UI ui;

    public Crosshair(UI ui)
    {
        this.ui = ui;
        
        
    }

public void render(){
        ui.stroke(255,255,255);
        ui.line(500,200,500,400);
        ui.line(750,200,750,400);
        ui.line(500,200,525,200);
        ui.line(500,400,525,400);
        ui.line(750,200,725,200);
        ui.line(750,400,725,400);
        ui.noFill();
        ui.ellipse(625,300,25,25);
    




}





}
