package OOPS;

import processing.core.PApplet;

public class Circle extends PApplet {
    int xcor;   //x coordinate of Circle
    int ycor;   //y coordinate of Circle
    int dia;    //radius of Circle
    int speed;  //speed of Circle
    Circle(int xcor,int ycor,int dia,int speed){
        this.xcor = xcor;
        this.ycor = ycor;
        this.dia = dia;
        this.speed = speed;
    }
}
