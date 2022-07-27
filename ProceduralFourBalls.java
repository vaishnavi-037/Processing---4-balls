import processing.core.PApplet;

public class ProceduralFourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int bx1 = 0;  //x-coordinate of Ball1
    int bx2 = 0;  //x-coordinate of Ball2
    int bx3 = 0;  //x-coordinate of Ball3
    int bx4 = 0;  //x-coordinate of Ball4

    public static void main(String[] args){
        PApplet.main("ProceduralFourBalls",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);   //size of the sketch window
    }
    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(bx1,(HEIGHT)/5, DIAMETER, DIAMETER);
        bx1++;
        ellipse(bx2,(2*HEIGHT)/5, DIAMETER, DIAMETER);
        bx2+=2;
        ellipse(bx3,(3*HEIGHT)/5, DIAMETER, DIAMETER);
        bx3+=3;
        ellipse(bx4,(4*HEIGHT)/5, DIAMETER, DIAMETER);
        bx4+=4;
    }
}
