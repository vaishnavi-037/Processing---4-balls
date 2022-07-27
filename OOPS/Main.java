package OOPS;

import processing.core.PApplet;
import java.util.ArrayList;

public class Main extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int NUMBER_OF_BALLS = 4;
    public static final int DIAMETER = 10;

    private static ArrayList<Circle> balls = new ArrayList<>();

    public static void main(String[] args){
        PApplet.main("OOPS.Main",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);   //size of the sketch window
        for(int i=1;i<=NUMBER_OF_BALLS;i++){
            balls.add(new Circle(0,(i*HEIGHT)/5, DIAMETER, i));
        }
    }

    @Override
    public void draw() {
        for(Circle ball : balls){
            ellipse(ball.xcor,ball.ycor,ball.dia,ball.dia);   //draw circle using ellipse function in PApplet
            ball.xcor += ball.speed;                          //for moving with provided speed
        }
    }
}
