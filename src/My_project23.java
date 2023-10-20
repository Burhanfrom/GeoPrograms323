public class My_project23 extends World{
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("Ben10.png");          //*** new method to load a diffrent JPG
        System.out.println("This will be printed to the  window. ");
        plane.teleport(193, 207);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for (int row = 1; row < plane.getBackGroundHeight(); row++)    //*** this is using new getBackground
        {
            for (int col = 1; col < plane.getBackGroundWidth(); col++)    //*** this is using new getBackgroun
            {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red > 20 && green > 100 && blue > 18) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(0, 0, 55);
                }
                if (red < 145 && green < 24 && blue < 29) {
                    plane.setPixelColor(0, 0, 200);
                }
                if ((red > 73 && green > 90 && blue > 40) && (red < 125 && green < 115 && blue < 60)) {
                    plane.setPixelColor(51, 51, 251);

                }


                if ((red > 2 && green > 4 && blue > 4) && (red > 50 && green < 50 && blue < 60)) {
                    plane.setPixelColor(33, 35, 4);
                }
            }
        }
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.teleport(0, 0);
        plane.pausetime = 1;
        plane.move(1000);
        plane.turn(90);
        plane.move(435);
        plane.turn(90);
        plane.move(1000);
        plane.turn(90);
        plane.move(435);

        plane.teleport(593,11);
        plane.pausetime = 1;
        for (int k = 1; k < 5; k++) {
            for (int j = 1; j < 50; j = j + 1) {
                //plane.teleport(j * 100, k*100);
                plane.teleport(k * 20, j * 20);
                plane.setColor(10 * k, 5 * j, 255);
                plane.square(15);


            }
        }
    }
}






