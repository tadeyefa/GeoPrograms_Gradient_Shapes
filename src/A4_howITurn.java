

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 0,200);
        plane.move(100);
        plane.turn(90);
        plane.setColor(100, 100,100);
        plane.move(100);
        plane.turn(-120);
        plane.setColor(100, 100,0);
        plane.move(100);
        plane.turn(-120);
        plane.setColor(100, 0,100);
        plane.move(100);
    }


}
