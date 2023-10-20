import javax.naming.InitialContext;

public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        //Initial();
        //square();
        rowOfSquare();
        //   countdown();
    }

    public void Initial() {
        plane.isTrail = true;
        //      plane.turn(90);
        // plane.move(100);
        //  plane.turn(260);
        //   plane.move(50);
        // plane.turn(300);
        //  plane.move(100);
        //   plane.turn(90);

        // for(int i=0; i<5; i=i+1 ){
        //   for(int j=0; j<i; j=j+1 ){
        // System.out.print("*");

    }

    ;     //  public void countdown(){
    //    for(int i=7; i>0; i=i-1) {
    //       System.out.println(i);
    //  }
//}


    //   System.out.println();
    //}


    public void square() {
        for (int i = 0; i < 4; i = i+1) {
            plane.isTrail = true;
            plane.move(50);
            plane.turn(90);
        }
    }

    public void rowOfSquare() {
        plane.pausetime = 1;
        for (int k = 1; k < 5; k++) {
            for (int j = 1; j < 50; j = j + 1) {
                //plane.teleport(j * 100, k*100);
                plane.teleport(k*20, j*20);
                plane.setColor(10*k, 5*j, 255);
                plane.square(15);
            }
        }
    }
}