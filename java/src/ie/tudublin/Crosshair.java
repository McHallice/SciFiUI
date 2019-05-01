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
        ui.textSize(32);
        ui.text("Gun",100,500);
        ui.text(100,250,500);
        ui.line(175,495,200,495);
        ui.text("MSL",100,550);
        ui.text(105,250,550);
        ui.line(175,545,200,545);
        ui.text("LAAM",100,600);
        ui.text(20,250,600);
        ui.line(200,595,225,596);
        ui.text("DMG",100,650);
        ui.text("0%",250,650);
        ui.line(175,645,200,645);




}





}
