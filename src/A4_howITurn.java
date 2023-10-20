

public class A4_howITurn extends World {
    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
for(int i = 0; i < 4; i++) {
    plane.isTrail();
    plane.move(100);
    plane.turn(90);
    plane.move(100);
    plane.turn(90);
    plane.move(100);
    plane.turn(90);
    plane.move(100);
    plane.turn(220);
    plane.move(50);
    plane.turn(-70);
    plane.move(50);

    plane.teleport(200, 500);
    plane.move(200);
    plane.turn(30);
    plane.move(200);

    plane.teleport(200, 600);
    plane.move(200);
    plane.turn(-30);
    plane.move(200);
    plane.turn(90);
    plane.move(100);
    plane.turn(90);
    plane.move(200);
    plane.turn(45);
    plane.move(200);
}
//


    } // // Variable:
    // Method:  Plane.startingAngle, Plane.isTrail, Plane.setColor, plane.move, Plane.turn


}
