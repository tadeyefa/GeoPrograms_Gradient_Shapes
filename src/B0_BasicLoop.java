public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime = 0;
        plane.isTrail=true;
        for(int row=0;row<20;row=row+1) {
            for(int col=0;col<20;col=col+1) {
                int a = (int) (Math.random() * 10) + 1;
                System.out.println(a);
                plane.teleport(15+(50*col), 10+(40*row));
                plane.setColor(9*row, 11*col, 158);
                house();
            }
        }
    }

    public void house() {
//        plane.isTrail = true;
//        plane.startingAngle(0);
//        square(50);
//        plane.isTrail = false;
//        plane.startingAngle(270);
//        plane.move(200);
//        plane.isTrail = true;
//        plane.pausetime = 0;
//        sun(20);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 0;
        plane.startingAngle(90);
        mySquare();
        myTriangle();
    }

    public void mySquare() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.move(10);
        plane.turn(90);
        plane.move(10);
        plane.turn(90);
        plane.move(10);
        plane.turn(90);
        plane.move(10);
    }

    public void myTriangle () {
        plane.turn(-120);
        plane.move(10);
        plane.turn(-120);
        plane.move(10);
    }
}
