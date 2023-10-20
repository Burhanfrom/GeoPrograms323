import java.awt.event.KeyEvent;

public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime = 1;
        for(int i = 0; i < 100; i++){
            shape(20, 4);
        }



        // System.out.println("This message will be printed to the window below.");
        // System.out.println("That window is called the dos window");
//        plane.pausetime = 2;
//        plane.startingAngle(0);
//        plane.isTrail = true;
//        plane.move(200);
//        plane.isTrail = false;
//        plane.move(100);
//        plane.isTrail = true;
//        plane.move(200);
// Data types
        // Int = integer ; 1,2,4
        // chan = charactors; A, B
        // String = word/ sentence
        // budians; true / false

    }

    public void shape(int i, int j){
        plane.isTrail = true;
        plane.move(i);
        plane.turn(j);
    }


    public void shape1(int i, int j) {



        double turnAngle = (180*(j-2))/j;
        for(int a = 0; a < 10; a++) {
            for (int x = 0;  x < (j); x = x+1) {
                plane.isTrail = true;
                plane.move(i*a);
                plane.turn(turnAngle);
            }
        }
    }
}
/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/