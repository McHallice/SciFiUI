package ie.tudublin;

import processing.core.PApplet;



public class Crosshair extends PApplet{

    private UI ui;
    private float move;
    private float move2;
    private float move3;
    private float move4;
    private float move5;
    private float move6;
    

    public Crosshair(UI ui, float move, float move2, float move3, float move4, float move5, float move6)
    {
        this.ui = ui;
        this.move = move;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
        this.move5 = move5;
        this.move6 = move6;

        
        
    }



public void render(){
        ui.stroke(255,255,255);
        ui.line(move,move3,move,move4);
        ui.line(move2,move3,move2,move4);
        ui.line(move,move3,move5,move3);
        ui.line(move,move4,move5,move4);
        ui.line(move2,move3,move6,move3);
        ui.line(move2,move4,move6,move4);
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






