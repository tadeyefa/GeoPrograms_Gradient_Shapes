public class CSProject1 extends World {
    public int red;
    public int green;
    public int blue;

    public void go()
    {
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 0;

        plane.loadBackGround("patterns.png");
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0,0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for(int row=300; row<800; row++)
        {
            for(int col=10; col<1000; col++)
            {
                plane.teleport(col,row);

                red   = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue  = plane.howMuchBlue();

                if((red>30 && green>0 && blue>145) && (red<160 && green<40 && blue<230))
                {
                    plane.setPixelColor(50,210,18);
                }

            }
        }

        plane.teleport(725, 150);
        plane.setColor(255, 255, 0);
        sun();

        for (int x=0;x<4;x++) {
            for (int y=0;y<3;y++) {
                int a = (int) (Math.random() * 10) + 1;
                System.out.println(a);
                plane.setColor(75*x, 25*y, 158);
                plane.teleport(110+(x*160), 150+(y*250));
                rectangle(100, 50);
            }
        }

        for (int l=0;l<2;l++) {
            int r = (int) (Math.random()*2)+1;
            System.out.println(r);
            plane.teleport(750, 550);
            if ((int) (Math.random()*2)+1 == 1) {
                hexagon(75);
            }
            if ((int) (Math.random()*2)+1 == 2) {
                octagon(75);
            }
        }
    }

    public void rectangle(int a, int b) {
        for (int c=0;c<4;c++) {
            plane.move(a);
            plane.turn(90);
            plane.move(b);
            plane.turn(90);
            plane.move(a);
            plane.turn(90);
            plane.move(b);
        }
    }

    public void sun() {
        for (int x=0;x<365;x++) {
            plane.move(1);
            plane.turn(1);
        }
    }

    public void hexagon(int h) {
        for (int n=0;n<6;n++) {
            plane.move(h);
            plane.turn(60);
        }
    }

    public void octagon(int o) {
        for (int g=0;g<8;g++) {
            plane.move(o);
            plane.turn(45);
        }
    }
}
