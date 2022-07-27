import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int bx1= 0;
    int bx2 = 0;
    int bx3 = 0;
    int bx4 = 0;



    public static void main(String[] args){
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);   //size of the sketch window
    }
    //shift+fn+f10 for running the code
    //ctrl+shift+fn+F12 for focus screen and for toggle
    //ctrl+Alt+C for refactoring the variable(extract variable) place the cursor which to be refactor and press these combinations
    //Ctrl+Alt+M -> Extract method
    //Ctrl+Alt+V -> Extract variable
    @Override
    public void setup() {
//        ellipse(WIDTH/2,HEIGHT/2, 100,100);  //drawing ellipse at the center
    }

    @Override
    public void draw() {
//        getWhiteBackground();
        drawCircle();
    }

    private void drawCircle() {
        ellipse(bx1,(1*HEIGHT)/5, DIAMETER, DIAMETER);
        bx1++;
        ellipse(bx2,(2*HEIGHT)/5, DIAMETER, DIAMETER);
        bx2+=2;
        ellipse(bx3,(3*HEIGHT)/5, DIAMETER, DIAMETER);
        bx3+=3;
        ellipse(bx4,(4*HEIGHT)/5, DIAMETER, DIAMETER);
        bx4+=4;
    }

    private void getWhiteBackground() {
        background(255);
    }

}

